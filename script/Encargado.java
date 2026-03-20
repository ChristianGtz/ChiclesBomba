/**
 * Director del patron Builder. Conoce los pasos para construir los paquetes
 * prefabricados de herramientas ninja (Basico, Avanzado, Tactico).
 *
 * @author [nombre]
 * @version 1.0
 */
public class Encargado {

    /** Builder utilizado para construir los paquetes. */
    private PaqueteBuilder builder;

    /**
     * Constructor que recibe el builder a utilizar.
     *
     * @param builder Implementacion del builder de paquetes.
     */
    public Encargado(PaqueteBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construye el Paquete Basico: 1 Kunai, 1 Shuriken, 1 Botiquin.
     *
     * @return Paquete Basico construido.
     */
    public PaqueteHerramientas construirBasico() {
        return builder
                .agregarKunais(1)
                .agregarShurikens(1)
                .agregarBotiquines(1)
                .build();
    }

    /**
     * Construye el Paquete Avanzado: 2 Shurikens, 3 Papeles Bomba,
     * 2 Bombas de Humo, 2 Botiquines.
     *
     * @return Paquete Avanzado construido.
     */
    public PaqueteHerramientas construirAvanzado() {
        return builder
                .agregarShurikens(2)
                .agregarPapelesBomba(3)
                .agregarBombasDeHumo(2)
                .agregarBotiquines(2)
                .build();
    }

    /**
     * Construye el Paquete Tactico: 3 Kunais, 2 Shurikens,
     * 4 Papeles Bomba, 2 Bombas de Humo.
     *
     * @return Paquete Tactico construido.
     */
    public PaqueteHerramientas construirTactico() {
        return builder
                .agregarKunais(3)
                .agregarShurikens(2)
                .agregarPapelesBomba(4)
                .agregarBombasDeHumo(2)
                .build();
    }
}
