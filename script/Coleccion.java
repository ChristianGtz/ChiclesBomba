/**
 * Interfaz generica que define el contrato de una coleccion iterable.
 * Toda coleccion que implemente esta interfaz puede crear su propio iterador.
 *
 * @param <T> Tipo de elemento almacenado en la coleccion.
 * @author [nombre]
 * @version 1.0
 */
public interface Coleccion<T> {

    /**
     * Crea y retorna un iterador para recorrer los elementos de la coleccion.
     *
     * @return Un iterador de tipo Iterator&lt;T&gt;.
     */
    Iterator<T> crearIterador();
}
