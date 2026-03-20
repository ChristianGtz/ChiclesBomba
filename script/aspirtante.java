/**
 * Representa a un prospecto interesado en ingresar a la Academia Ninja.
 * Almacena su informacion personal y nivel de habilidad.
 *
 * @author [nombre]
 * @version 1.0
 */
public class Aspirante {

    /** Nombre del aspirante. */
    private String nombre;

    /** Edad del aspirante. */
    private int edad;

    /** Clan de procedencia del aspirante. */
    private String clan;

    /** Nivel de habilidad del aspirante (rango 1-3). */
    private int nivelHabilidad;

    /**
     * Constructor que inicializa todos los atributos del aspirante.
     *
     * @param nombre         Nombre del aspirante.
     * @param edad           Edad del aspirante.
     * @param clan           Clan de procedencia (Fuchiha, Osomaki, Naca, Mortalika, Akipichi).
     * @param nivelHabilidad Nivel de habilidad entre 1 y 3.
     */
    public Aspirante(String nombre, int edad, String clan, int nivelHabilidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.clan = clan;
        this.nivelHabilidad = nivelHabilidad;
    }

    /**
     * Retorna el nombre del aspirante.
     *
     * @return Nombre del aspirante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la edad del aspirante.
     *
     * @return Edad del aspirante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Retorna el clan de procedencia del aspirante.
     *
     * @return Clan del aspirante.
     */
    public String getClan() {
        return clan;
    }

    /**
     * Retorna el nivel de habilidad del aspirante.
     *
     * @return Nivel de habilidad (1-3).
     */
    public int getNivelHabilidad() {
        return nivelHabilidad;
    }

    /**
     * Retorna una representacion en cadena del aspirante.
     *
     * @return Cadena con los datos del aspirante.
     */
    @Override
    public String toString() {
        return nombre + " (Clan: " + clan + ", Edad: " + edad + ", Nivel: " + nivelHabilidad + ")";
    }
}
