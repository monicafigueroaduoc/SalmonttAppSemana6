package org.example.model;

/**
 * Clase {@code CentroCultivo} representa un Centro de cultivo de salmones
 * en el sistema {@code SalmonttAppSemana6}.
 *
 *  Extiende de UnidadOperativa e incluye la producción anual estimada.
 *
 *  <p>Esta clase sobrescribe {@link #toString()} para entregar tanto los
 *  atributos heredados como el atributo propio {@code produccionAnualToneladas}
 *  utilizando los getters de la superclase.</p>
 *
 *  @author Monica Figueroa
 *  @version 1.0
 */
public class CentroCultivo extends UnidadOperativa{
    private double produccionAnualToneladas;

    /**
     * Crea un nuevo centro de cultivo.
     *
     * @param nombre Nombre del centro.
     * @param comuna Comuna donde se encuentra el centro.
     * @param produccionAnualToneladas Produccion anual estimada en toneladas.
     */
    public CentroCultivo(String nombre, String comuna, double produccionAnualToneladas) {

        // Llamada al constructor de la superclase para inicializar nombre y comuna.
        super(nombre, comuna);
        this.produccionAnualToneladas = produccionAnualToneladas;
    }

    /**
     * Muestra en consola la información del Centro de Cultivo de forma legible.
     * @return texto con los datos del Centro.
     */
    @Override
    public String toString() {
        return "Centro de cultivo " + getNombre() + "(" + getComuna() + ")"
                + " | Produccion anual : "
                + produccionAnualToneladas + " t/anio" + "\n";
    }
}
