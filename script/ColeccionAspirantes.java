import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Coleccion de aspirantes almacenada internamente en una Hashtable.
 * Implementa la interfaz Coleccion para permitir la creacion de iteradores.
 *
 * @author [nombre]
 * @version 1.0
 */
public class ColeccionAspirantes implements Coleccion<Aspirante> {

    /** Tabla hash que almacena aspirantes con su nombre como clave. */
    private Hashtable<String, Aspirante> tabla;

    /**
     * Constructor que inicializa la tabla hash vacia.
     */
    public ColeccionAspirantes() {
        this.tabla = new Hashtable<>();
    }

    /**
     * Agrega un aspirante a la coleccion usando su nombre como clave.
     *
     * @param aspirante Aspirante a agregar.
     */
    public void agregar(Aspirante aspirante) {
        tabla.put(aspirante.getNombre(), aspirante);
    }

    /**
     * Retorna el numero de aspirantes en la coleccion.
     *
     * @return Cantidad de aspirantes.
     */
    public int size() {
        return tabla.size();
    }

    /**
     * Crea y retorna un iterador sobre los aspirantes almacenados.
     *
     * @return Iterador de aspirantes.
     */
    @Override
    public Iterator<Aspirante> crearIterador() {
        return new AspiranteIterator(new ArrayList<>(tabla.values()));
    }
}
