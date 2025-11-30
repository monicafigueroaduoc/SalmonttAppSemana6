package org.example.model;

/**
 * Representa una planta de proceso de salmones.
 * Amplía UnidadOperativa agregando la capacidad anual de procesamiento.
 *
 * @author Monica Figueroa
 * @version 1.0
 */
public class PlantaProceso extends UnidadOperativa{
    private double capacidadAnualToneladas;

    /**
     * Constructor de la planta de proceso.
     *
     * @param nombre Nombre de la planta.
     * @param comuna Comuna donde se ubica la planta.
     * @param capacidadAnualToneladas Capacidad de proceso anual.
     */
    public PlantaProceso(String nombre, String comuna, double capacidadAnualToneladas) {

        // Llamada al constructor de la superclase para inicializar nombre y comuna.
        super(nombre, comuna);
        this.capacidadAnualToneladas = capacidadAnualToneladas;
    }

    /**
     * Muestra en consola la información de la planta de proceso de forma legible.
     * @return texto con los datos de la planta.
     */
    @Override
    public String toString() {
        return "Planta de proceso " + getNombre() + "(" + getComuna() + ")"
                + " | Capacidad Anual: " + capacidadAnualToneladas + " t/anio" + "\n";
    }
}
