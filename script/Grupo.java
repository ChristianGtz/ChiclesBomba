import java.util.List;

/**
 * Representa un grupo de entrenamiento formado por un ninja lider,
 * sus aspirantes asignados, un paquete de herramientas y un campo de entrenamiento.
 *
 * @author [nombre]
 * @version 1.0
 */
public class Grupo {

    /** Ninja voluntario que lidera el grupo. */
    private Ninja lider;

    /** Lista de aspirantes asignados al grupo. */
    private List<Aspirante> aspirantes;

    /** Paquete de herramientas asignado al grupo. */
    private PaqueteHerramientas paquete;

    /** Campo de entrenamiento asignado al grupo. */
    private CampoEntrenamiento campo;

    /**
     * Constructor que inicializa todos los atributos del grupo.
     *
     * @param lider      Ninja lider del grupo.
     * @param aspirantes Lista de aspirantes del grupo.
     * @param paquete    Paquete de herramientas asignado.
     * @param campo      Campo de entrenamiento asignado.
     */
    public Grupo(Ninja lider, List<Aspirante> aspirantes,
                 PaqueteHerramientas paquete, CampoEntrenamiento campo) {
        this.lider = lider;
        this.aspirantes = aspirantes;
        this.paquete = paquete;
        this.campo = campo;
    }

    /**
     * Calcula la suma de los niveles de habilidad de todos los integrantes
     * del grupo (lider + aspirantes).
     *
     * @return Suma total de niveles de habilidad.
     */
    public int calcularSumaHabilidades() {
        int suma = lider.getNivelHabilidad();
        for (Aspirante a : aspirantes) {
            suma += a.getNivelHabilidad();
        }
        return suma;
    }

    /**
     * Imprime en consola el resumen completo del grupo: integrantes,
     * paquete con peso total y campo de entrenamiento.
     */
    public void mostrarResumen() {
        System.out.println("==========================================");
        System.out.println("LIDER: " + lider);
        System.out.println("ASPIRANTES:");
        for (Aspirante a : aspirantes) {
            System.out.println("  - " + a);
        }
        System.out.println("PAQUETE DE HERRAMIENTAS:");
        System.out.println(paquete);
        System.out.println("CAMPO DE ENTRENAMIENTO:");
        System.out.println("  " + campo);
        System.out.println("==========================================");
    }

    /**
     * Retorna el ninja lider del grupo.
     *
     * @return Lider del grupo.
     */
    public Ninja getLider() {
        return lider;
    }

    /**
     * Retorna la lista de aspirantes del grupo.
     *
     * @return Lista de aspirantes.
     */
    public List<Aspirante> getAspirantes() {
        return aspirantes;
    }

    /**
     * Retorna el paquete de herramientas del grupo.
     *
     * @return Paquete de herramientas.
     */
    public PaqueteHerramientas getPaquete() {
        return paquete;
    }

    /**
     * Retorna el campo de entrenamiento del grupo.
     *
     * @return Campo de entrenamiento.
     */
    public CampoEntrenamiento getCampo() {
        return campo;
    }
}
