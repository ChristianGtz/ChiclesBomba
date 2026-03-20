/**
 * Ninja de rango Chunin. Puede liderar hasta 2 aspirantes.
 *
 * @author [nombre]
 * @version 1.0
 */
public class Chunin extends Ninja {

    /**
     * Constructor de Chunin.
     *
     * @param nombre         Nombre del ninja.
     * @param edad           Edad del ninja.
     * @param clan           Clan de procedencia.
     * @param nivelHabilidad Nivel de habilidad (4-6).
     */
    public Chunin(String nombre, int edad, String clan, int nivelHabilidad) {
        super(nombre, edad, clan, nivelHabilidad);
    }

    /**
     * Retorna el maximo de aspirantes que puede liderar un Chunin.
     *
     * @return 2
     */
    @Override
    public int getMaxAspirantes() {
        return 2;
    }
}
