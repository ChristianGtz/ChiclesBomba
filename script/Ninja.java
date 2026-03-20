/**
 * Clase abstracta que representa a un ninja voluntario de la Academia.
 * Define la estructura comun de todos los rangos de ninja.
 *
 * @author [nombre]
 * @version 1.0
 */
public abstract class Ninja {

    /** Nombre del ninja. */
    private String nombre;

    /** Edad del ninja. */
    private int edad;

    /** Clan de procedencia del ninja. */
    private String clan;

    /** Nivel de habilidad del ninja (rango 4-6). */
    private int nivelHabilidad;

    /**
     * Constructor que inicializa los atributos comunes de todo ninja.
     *
     * @param nombre         Nombre del ninja.
     * @param edad           Edad del ninja.
     * @param clan           Clan de procedencia.
     * @param nivelHabilidad Nivel de habilidad entre 4 y 6.
     */
    public Ninja(String nombre, int edad, String clan, int nivelHabilidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.clan = clan;
        this.nivelHabilidad = nivelHabilidad;
    }

    /**
     * Retorna el numero maximo de aspirantes que puede liderar este ninja
     * segun su rango. Cada subclase define su propio valor.
     *
     * @return Numero maximo de aspirantes.
     */
    public abstract int getMaxAspirantes();

    /**
     * Retorna el nombre del ninja.
     *
     * @return Nombre del ninja.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la edad del ninja.
     *
     * @return Edad del ninja.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Retorna el clan del ninja.
     *
     * @return Clan del ninja.
     */
    public String getClan() {
        return clan;
    }

    /**
     * Retorna el nivel de habilidad del ninja.
     *
     * @return Nivel de habilidad (4-6).
     */
    public int getNivelHabilidad() {
        return nivelHabilidad;
    }

    /**
     * Retorna una representacion en cadena del ninja.
     *
     * @return Cadena con los datos del ninja.
     */
    @Override
    public String toString() {
        return nombre + " [" + getClass().getSimpleName() + "] (Clan: " + clan
                + ", Edad: " + edad + ", Nivel: " + nivelHabilidad + ")";
    }
}
