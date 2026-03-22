/**
 * Implementacion concreta del patron Builder para construir paquetes de herramientas.
 * Permite agregar herramientas individualmente y construir el paquete final.
 *
 * @author [nombre]
 * @version 1.0
 */
public class PaqueteHerramientasBuilder implements PaqueteBuilder {

    /** Paquete en construccion. */
    private PaqueteHerramientas paquete;

    /**
     * Constructor que inicializa un nuevo paquete vacio.
     */
    public PaqueteHerramientasBuilder() {
        reset();
    }

    /**
     * Reinicia el builder con un paquete vacio para reutilizacion.
     */
    public void reset() {
        this.paquete = new PaqueteHerramientas();
    }

    /**
     * Agrega la cantidad indicada de Kunais al paquete.
     *
     * @param cantidad Numero de Kunais.
     * @return Esta instancia del builder.
     */
    @Override
    public PaqueteBuilder agregarKunais(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            paquete.agregarHerramienta(new Kunai());
        }
        return this;
    }

    /**
     * Agrega la cantidad indicada de Shurikens al paquete.
     *
     * @param cantidad Numero de Shurikens.
     * @return Esta instancia del builder.
     */
    @Override
    public PaqueteBuilder agregarShurikens(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            paquete.agregarHerramienta(new Shuriken());
        }
        return this;
    }

    /**
     * Agrega la cantidad indicada de Papeles Bomba al paquete.
     *
     * @param cantidad Numero de Papeles Bomba.
     * @return Esta instancia del builder.
     */
    @Override
    public PaqueteBuilder agregarPapelesBomba(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            paquete.agregarHerramienta(new PapelBomba());
        }
        return this;
    }

    /**
     * Agrega la cantidad indicada de Bombas de Humo al paquete.
     *
     * @param cantidad Numero de Bombas de Humo.
     * @return Esta instancia del builder.
     */
    @Override
    public PaqueteBuilder agregarBombasDeHumo(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            paquete.agregarHerramienta(new BombaDeHumo());
        }
        return this;
    }

    /**
     * Agrega la cantidad indicada de Botiquines al paquete.
     *
     * @param cantidad Numero de Botiquines.
     * @return Esta instancia del builder.
     */
    @Override
    public PaqueteBuilder agregarBotiquines(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            paquete.agregarHerramienta(new Botiquin());
        }
        return this;
    }

    /**
     * Finaliza la construccion, retorna el paquete y reinicia el builder.
     *
     * @return El paquete de herramientas construido.
     */
    @Override
    public PaqueteHerramientas build() {
        PaqueteHerramientas resultado = paquete;
        reset();
        return resultado;
    }
}
