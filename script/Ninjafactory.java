/**
 * Fabrica de ninjas. Crea instancias concretas de Ninja segun el rango indicado.
 * Implementa el patron Factory Method.
 *
 * @author [nombre]
 * @version 1.0
 */
public class NinjaFactory {

    /**
     * Crea y retorna un Ninja concreto segun el rango especificado.
     *
     * @param rango          Rango del ninja: "genin", "chunin" o "jonin".
     * @param nombre         Nombre del ninja.
     * @param edad           Edad del ninja.
     * @param clan           Clan de procedencia.
     * @param nivelHabilidad Nivel de habilidad (4-6).
     * @return Instancia concreta de Ninja correspondiente al rango.
     * @throws IllegalArgumentException Si el rango no es valido.
     */
    public Ninja crearNinja(String rango, String nombre, int edad, String clan, int nivelHabilidad) {
        switch (rango.toLowerCase()) {
            case "genin":
                return new Genin(nombre, edad, clan, nivelHabilidad);
            case "chunin":
                return new Chunin(nombre, edad, clan, nivelHabilidad);
            case "jonin":
                return new Jonin(nombre, edad, clan, nivelHabilidad);
            default:
                throw new IllegalArgumentException("Rango invalido: " + rango);
        }
    }
}
