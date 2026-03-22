/**
 * Clase abstracta que representa un campo de entrenamiento ninja.
 * Cada campo tiene un nombre y una descripcion del lugar.
 *
 * @author [nombre]
 * @version 1.0
 */
public abstract class CampoEntrenamiento {

    /** Nombre del campo de entrenamiento. */
    private String nombre;

    /** Descripcion del campo de entrenamiento. */
    private String descripcion;

    /**
     * Constructor que inicializa el nombre y la descripcion del campo.
     *
     * @param nombre      Nombre del campo.
     * @param descripcion Descripcion del campo.
     */
    public CampoEntrenamiento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Retorna el nombre del campo de entrenamiento.
     *
     * @return Nombre del campo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la descripcion del campo de entrenamiento.
     *
     * @return Descripcion del campo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Retorna una representacion en cadena del campo.
     *
     * @return Nombre y descripcion del campo.
     */
    @Override
    public String toString() {
        return nombre + ": " + descripcion;
    }
}
