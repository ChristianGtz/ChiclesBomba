/**
 * Ninja de rango Genin. Puede liderar hasta 1 aspirante.
 *
 * @author [nombre]
 * @version 1.0
 */
public class Genin extends Ninja {

    /**
     * Constructor de Genin.
     *
     * @param nombre         Nombre del ninja.
     * @param edad           Edad del ninja.
     * @param clan           Clan de procedencia.
     * @param nivelHabilidad Nivel de habilidad (4-6).
     */
    public Genin(String nombre, int edad, String clan, int nivelHabilidad) {
        super(nombre, edad, clan, nivelHabilidad);
    }

    /**
     * Retorna el maximo de aspirantes que puede liderar un Genin.
     *
     * @return 1
     */
    @Override
    public int getMaxAspirantes() {
        return 1;
    }
}
