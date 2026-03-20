import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal de la Academia Ninja. Orquesta la carga de datos,
 * la formacion de grupos, la asignacion de paquetes y la presentacion
 * del resumen final.
 *
 * @author [nombre]
 * @version 1.0
 */
public class App {

    /**
     * Punto de entrada del programa. Carga aspirantes y ninjas, forma grupos
     * interactivamente y muestra el resumen al finalizar.
     *
     * @param args Argumentos de linea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Cargar aspirantes en HashTable ---
        ColeccionAspirantes coleccionAspirantes = new ColeccionAspirantes();
        coleccionAspirantes.agregar(new Aspirante("Naruko",    12, "Fuchiha",   2));
        coleccionAspirantes.agregar(new Aspirante("Sasuke",    12, "Fuchiha",   3));
        coleccionAspirantes.agregar(new Aspirante("Sakura",    12, "Osomaki",   1));
        coleccionAspirantes.agregar(new Aspirante("Hinata",    12, "Naca",      2));
        coleccionAspirantes.agregar(new Aspirante("Shikamaru", 12, "Mortalika", 3));
        coleccionAspirantes.agregar(new Aspirante("Choji",     12, "Akipichi",  1));
        coleccionAspirantes.agregar(new Aspirante("Ino",       12, "Fuchiha",   2));
        coleccionAspirantes.agregar(new Aspirante("Kiba",      12, "Osomaki",   2));
        coleccionAspirantes.agregar(new Aspirante("Shino",     12, "Naca",      1));
        coleccionAspirantes.agregar(new Aspirante("Tenten",    12, "Mortalika", 3));

        // --- Cargar ninjas en Array usando NinjaFactory ---
        NinjaFactory ninjaFactory = new NinjaFactory();
        ColeccionNinjas coleccionNinjas = new ColeccionNinjas(10);
        coleccionNinjas.agregar(ninjaFactory.crearNinja("jonin",  "Kakashi", 26, "Fuchiha",   6));
        coleccionNinjas.agregar(ninjaFactory.crearNinja("chunin", "Iruka",   25, "Osomaki",   5));
        coleccionNinjas.agregar(ninjaFactory.crearNinja("genin",  "Rock Lee", 13, "Naca",     4));
        coleccionNinjas.agregar(ninjaFactory.crearNinja("jonin",  "Kurenai", 27, "Mortalika", 6));
        coleccionNinjas.agregar(ninjaFactory.crearNinja("chunin", "Anko",    24, "Akipichi",  5));

        // --- Preparar Builder, Director y Factory de campos ---
        PaqueteHerramientasBuilder builder = new PaqueteHerramientasBuilder();
        Encargado encargado = new Encargado(builder);
        CampoEntrenamientoFactory campoFactory = new CampoEntrenamientoFactory();

        // --- Iteradores ---
        Iterator<Ninja> ninjaIter = coleccionNinjas.crearIterador();
        Iterator<Aspirante> aspiranteIter = coleccionAspirantes.crearIterador();

        List<Grupo> grupos = new ArrayList<>();

        System.out.println("=== ACADEMIA NINJA - FORMACION DE GRUPOS ===\n");

        // --- Formar grupos ---
        while (ninjaIter.hasNext() && aspiranteIter.hasNext()) {
            Ninja lider = ninjaIter.next();
            int maxAsp = lider.getMaxAspirantes();

            System.out.println("Lider asignado: " + lider);
            System.out.println("Puede llevar hasta " + maxAsp + " aspirante(s).\n");

            // Asignar aspirantes segun rango del lider
            List<Aspirante> aspirantesGrupo = new ArrayList<>();
            for (int i = 0; i < maxAsp && aspiranteIter.hasNext(); i++) {
                Aspirante asp = aspiranteIter.next();
                aspirantesGrupo.add(asp);
                System.out.println("  Aspirante asignado: " + asp);
            }

            // Elegir paquete
            System.out.println("\nElige el paquete para este grupo:");
            System.out.println("  1. Basico    (1 Kunai, 1 Shuriken, 1 Botiquin)");
            System.out.println("  2. Avanzado  (2 Shurikens, 3 Papeles Bomba, 2 Bombas de Humo, 2 Botiquines)");
            System.out.println("  3. Tactico   (3 Kunais, 2 Shurikens, 4 Papeles Bomba, 2 Bombas de Humo)");
            System.out.println("  4. Personalizado");
            System.out.print("Opcion: ");

            int opcion = leerEntero(scanner, 1, 4);
            PaqueteHerramientas paquete;

            switch (opcion) {
                case 1:
                    paquete = encargado.construirBasico();
                    break;
                case 2:
                    paquete = encargado.construirAvanzado();
                    break;
                case 3:
                    paquete = encargado.construirTactico();
                    break;
                default:
                    paquete = construirPersonalizado(scanner, builder);
                    break;
            }

            // Calcular suma de habilidades y asignar campo
            int sumaHabilidades = lider.getNivelHabilidad();
            for (Aspirante a : aspirantesGrupo) {
                sumaHabilidades += a.getNivelHabilidad();
            }
            CampoEntrenamiento campo = campoFactory.crearCampo(sumaHabilidades);

            grupos.add(new Grupo(lider, aspirantesGrupo, paquete, campo));
            System.out.println("Grupo formado. Campo asignado: " + campo.getNombre() + "\n");
        }

        // Disculparse con aspirantes sobrantes
        if (aspiranteIter.hasNext()) {
            System.out.println("--- No hay mas ninjas disponibles. Aspirantes sin grupo: ---");
            while (aspiranteIter.hasNext()) {
                System.out.println("  " + aspiranteIter.next());
            }
            System.out.println();
        }

        // --- Resumen final ---
        System.out.println("\n========== RESUMEN FINAL DE GRUPOS ==========\n");
        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("GRUPO " + (i + 1));
            grupos.get(i).mostrarResumen();
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Permite al usuario construir un paquete personalizado eligiendo
     * la cantidad de cada herramienta.
     *
     * @param scanner Scanner para leer la entrada del usuario.
     * @param builder Builder para construir el paquete.
     * @return Paquete personalizado construido.
     */
    private static PaqueteHerramientas construirPersonalizado(Scanner scanner,
                                                               PaqueteHerramientasBuilder builder) {
        System.out.println("\n-- Paquete personalizado --");

        System.out.print("Kunais: ");
        int kunais = leerEntero(scanner, 0, 10);

        System.out.print("Shurikens: ");
        int shurikens = leerEntero(scanner, 0, 10);

        System.out.print("Papeles Bomba: ");
        int papeles = leerEntero(scanner, 0, 10);

        System.out.print("Bombas de Humo: ");
        int bombas = leerEntero(scanner, 0, 10);

        System.out.print("Botiquines: ");
        int botiquines = leerEntero(scanner, 0, 10);

        return builder
                .agregarKunais(kunais)
                .agregarShurikens(shurikens)
                .agregarPapelesBomba(papeles)
                .agregarBombasDeHumo(bombas)
                .agregarBotiquines(botiquines)
                .build();
    }

    /**
     * Lee un entero del scanner validando que este dentro del rango [min, max].
     * Repite la lectura hasta obtener un valor valido.
     *
     * @param scanner Scanner de entrada.
     * @param min     Valor minimo aceptado.
     * @param max     Valor maximo aceptado.
     * @return Entero valido ingresado por el usuario.
     */
    private static int leerEntero(Scanner scanner, int min, int max) {
        int valor = -1;
        while (valor < min || valor > max) {
            try {
                valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor < min || valor > max) {
                    System.out.print("Valor fuera de rango (" + min + "-" + max + "). Intenta de nuevo: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada invalida. Ingresa un numero entre " + min + " y " + max + ": ");
            }
        }
        return valor;
    }
}
