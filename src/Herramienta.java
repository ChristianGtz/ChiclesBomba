/**
 * Clase abstracta que representa una herramienta ninja con nombre y peso.
 *
 * @author [nombre]
 * @version 1.0
 */
public abstract class Herramienta {

    /** Nombre de la herramienta. */
    private String nombre;

    /** Peso de la herramienta en kilogramos. */
    private double peso;

    /**
     * Constructor que inicializa nombre y peso de la herramienta.
     *
     * @param nombre Nombre de la herramienta.
     * @param peso   Peso en kilogramos.
     */
    public Herramienta(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Retorna el nombre de la herramienta.
     *
     * @return Nombre de la herramienta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el peso de la herramienta.
     *
     * @return Peso en kilogramos.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Retorna una representacion en cadena de la herramienta.
     *
     * @return Nombre y peso de la herramienta.
     */
    @Override
    public String toString() {
        return nombre + " (" + peso + " kg)";
    }
}
