import java.util.ArrayList;
import java.util.List;

/**
 * Representa un paquete de herramientas ninja asignado a un grupo.
 * Almacena una lista de herramientas y calcula el peso total del paquete.
 *
 * @author [nombre]
 * @version 1.0
 */
public class PaqueteHerramientas {

    /** Lista de herramientas contenidas en el paquete. */
    private List<Herramienta> herramientas;

    /**
     * Constructor que inicializa el paquete con una lista vacia.
     */
    public PaqueteHerramientas() {
        this.herramientas = new ArrayList<>();
    }

    /**
     * Agrega una herramienta al paquete.
     *
     * @param herramienta Herramienta a agregar.
     */
    public void agregarHerramienta(Herramienta herramienta) {
        herramientas.add(herramienta);
    }

    /**
     * Calcula y retorna el peso total de todas las herramientas en el paquete.
     *
     * @return Peso total en kilogramos.
     */
    public double getPesoTotal() {
        double total = 0;
        for (Herramienta h : herramientas) {
            total += h.getPeso();
        }
        return total;
    }

    /**
     * Retorna la lista de herramientas del paquete.
     *
     * @return Lista de herramientas.
     */
    public List<Herramienta> getHerramientas() {
        return herramientas;
    }

    /**
     * Retorna una representacion en cadena del paquete con todas sus herramientas
     * y el peso total.
     *
     * @return Descripcion del paquete.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Herramienta h : herramientas) {
            sb.append("    - ").append(h).append("\n");
        }
        sb.append("    Peso total: ").append(String.format("%.1f", getPesoTotal())).append(" kg");
        return sb.toString();
    }
}
