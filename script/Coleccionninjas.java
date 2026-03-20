/**
 * Coleccion de ninjas almacenada internamente en un arreglo.
 * Implementa la interfaz Coleccion para permitir la creacion de iteradores.
 *
 * @author [nombre]
 * @version 1.0
 */
public class ColeccionNinjas implements Coleccion<Ninja> {

    /** Arreglo interno que almacena los ninjas. */
    private Ninja[] ninjas;

    /** Numero actual de ninjas en el arreglo. */
    private int size;

    /**
     * Constructor que inicializa el arreglo con capacidad fija.
     *
     * @param capacidad Capacidad maxima del arreglo.
     */
    public ColeccionNinjas(int capacidad) {
        this.ninjas = new Ninja[capacidad];
        this.size = 0;
    }

    /**
     * Agrega un ninja al arreglo si hay espacio disponible.
     *
     * @param ninja Ninja a agregar.
     */
    public void agregar(Ninja ninja) {
        if (size < ninjas.length) {
            ninjas[size++] = ninja;
        }
    }

    /**
     * Retorna el numero de ninjas en la coleccion.
     *
     * @return Cantidad de ninjas.
     */
    public int size() {
        return size;
    }

    /**
     * Crea y retorna un iterador sobre los ninjas almacenados.
     *
     * @return Iterador de ninjas.
     */
    @Override
    public Iterator<Ninja> crearIterador() {
        return new NinjaIterator(ninjas, size);
    }
}
