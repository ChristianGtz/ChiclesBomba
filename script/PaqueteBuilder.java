/**
 * Interfaz del patron Builder para la construccion de paquetes de herramientas ninja.
 * Define los pasos disponibles para agregar herramientas al paquete.
 *
 * @author [nombre]
 * @version 1.0
 */
public interface PaqueteBuilder {

    /**
     * Agrega una cantidad de Kunais al paquete.
     *
     * @param cantidad Numero de Kunais a agregar.
     * @return La instancia del builder para encadenamiento.
     */
    PaqueteBuilder agregarKunais(int cantidad);

    /**
     * Agrega una cantidad de Shurikens al paquete.
     *
     * @param cantidad Numero de Shurikens a agregar.
     * @return La instancia del builder para encadenamiento.
     */
    PaqueteBuilder agregarShurikens(int cantidad);

    /**
     * Agrega una cantidad de Papeles Bomba al paquete.
     *
     * @param cantidad Numero de Papeles Bomba a agregar.
     * @return La instancia del builder para encadenamiento.
     */
    PaqueteBuilder agregarPapelesBomba(int cantidad);

    /**
     * Agrega una cantidad de Bombas de Humo al paquete.
     *
     * @param cantidad Numero de Bombas de Humo a agregar.
     * @return La instancia del builder para encadenamiento.
     */
    PaqueteBuilder agregarBombasDeHumo(int cantidad);

    /**
     * Agrega una cantidad de Botiquines al paquete.
     *
     * @param cantidad Numero de Botiquines a agregar.
     * @return La instancia del builder para encadenamiento.
     */
    PaqueteBuilder agregarBotiquines(int cantidad);

    /**
     * Finaliza la construccion y retorna el paquete armado.
     *
     * @return El paquete de herramientas construido.
     */
    PaqueteHerramientas build();
}
