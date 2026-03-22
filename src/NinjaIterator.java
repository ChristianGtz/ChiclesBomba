/**
 * Iterador concreto para recorrer una coleccion de ninjas almacenada en un arreglo.
 *
 * @author [nombre]
 * @version 1.0
 */
public class NinjaIterator implements Iterator<Ninja> {

    /** Arreglo de ninjas sobre el que itera. */
    private Ninja[] ninjas;

    /** Numero de ninjas validos en el arreglo. */
    private int size;

    /** Indice actual del iterador. */
    private int indice;

    /**
     * Constructor que recibe el arreglo y su tamano valido.
     *
     * @param ninjas Arreglo de ninjas.
     * @param size   Numero de elementos validos en el arreglo.
     */
    public NinjaIterator(Ninja[] ninjas, int size) {
        this.ninjas = ninjas;
        this.size = size;
        this.indice = 0;
    }

    /**
     * Indica si aun hay ninjas por recorrer.
     *
     * @return true si hay mas ninjas, false en caso contrario.
     */
    @Override
    public boolean hasNext() {
        return indice < size;
    }

    /**
     * Retorna el siguiente ninja y avanza el cursor.
     *
     * @return El siguiente ninja en el arreglo.
     */
    @Override
    public Ninja next() {
        return ninjas[indice++];
    }
}
