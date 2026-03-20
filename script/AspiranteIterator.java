import java.util.List;

/**
 * Iterador concreto para recorrer una coleccion de aspirantes.
 * Opera sobre una lista extraida de la Hashtable de ColeccionAspirantes.
 *
 * @author [nombre]
 * @version 1.0
 */
public class AspiranteIterator implements Iterator<Aspirante> {

    /** Lista interna de aspirantes sobre la que itera. */
    private List<Aspirante> lista;

    /** Indice actual del iterador. */
    private int indice;

    /**
     * Constructor que recibe la lista de aspirantes a iterar.
     *
     * @param lista Lista de aspirantes extraida de la Hashtable.
     */
    public AspiranteIterator(List<Aspirante> lista) {
        this.lista = lista;
        this.indice = 0;
    }

    /**
     * Indica si aun hay aspirantes por recorrer.
     *
     * @return true si hay mas aspirantes, false en caso contrario.
     */
    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    /**
     * Retorna el siguiente aspirante y avanza el cursor.
     *
     * @return El siguiente aspirante en la lista.
     */
    @Override
    public Aspirante next() {
        return lista.get(indice++);
    }
}
