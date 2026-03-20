/**
 * Ninja de rango Jonin. Puede liderar hasta 3 aspirantes.
 *
 * @author [nombre]
 * @version 1.0
 */
public class Jonin extends Ninja {

    /**
     * Constructor de Jonin.
     *
     * @param nombre         Nombre del ninja.
     * @param edad           Edad del ninja.
     * @param clan           Clan de procedencia.
     * @param nivelHabilidad Nivel de habilidad (4-6).
     */
    public Jonin(String nombre, int edad, String clan, int nivelHabilidad) {
        super(nombre, edad, clan, nivelHabilidad);
    }

    /**
     * Retorna el maximo de aspirantes que puede liderar un Jonin.
     *
     * @return 3
     */
    @Override
    public int getMaxAspirantes() {
        return 3;
    }
}
