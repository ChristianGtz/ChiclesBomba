/**
 * Fabrica de campos de entrenamiento. Crea el campo adecuado segun la suma
 * de los niveles de habilidad del grupo. Implementa el patron Factory Method.
 *
 * @author [nombre]
 * @version 1.0
 */
public class CampoEntrenamientoFactory {

    /**
     * Crea y retorna el campo de entrenamiento correspondiente a la suma
     * de niveles de habilidad del grupo.
     *
     * <ul>
     *   <li>Suma menor o igual a 7: Valle del Dragon</li>
     *   <li>Suma entre 8 y 11: Bosque Sombrio</li>
     *   <li>Suma mayor o igual a 12: Montana Espiritual</li>
     * </ul>
     *
     * @param sumaHabilidades Suma de los niveles de habilidad del grupo.
     * @return Campo de entrenamiento asignado.
     */
    public CampoEntrenamiento crearCampo(int sumaHabilidades) {
        if (sumaHabilidades <= 7) {
            return new ValleDelDragon();
        } else if (sumaHabilidades <= 11) {
            return new BosqueSombrio();
        } else {
            return new MontanaEspiritual();
        }
    }
}
