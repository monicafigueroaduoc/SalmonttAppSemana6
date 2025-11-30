package org.example.model;

/**
 * Representa una unidad operativa dentro de la industria salmonera.
 * Es clase actúa como superclase de centros de cultivo y plantas de proceso.
 * Contiene atributos comunes como nombre y comuna.
 *
 * Los atributos son privados y se accede a ellos mediante getters para
 * mantener un encapsulamiento adecuado en la jerarquía.
 *
 * @author Monica Figueroa
 * @version 1.0
 */
public class UnidadOperativa {

    private String nombre;
    private String comuna;

    /**
     * Constructor base que analiza atributos comunes.
     * @param nombre Nombre de la unidad operativa.
     * @param comuna Ubicación de la unidad operativa.
     */
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    /** @return nombre de la unidad operativa */
    public String getNombre() {
        return nombre;
    }

    /** @return comuna donde se ubica la unidad operativa */
    public String getComuna() {
        return comuna;
    }

    /**
     * Muestra en consola la información de la unidad operativa de forma legible.
     * @return texto con los datos de la unidad operativa.
     */
    @Override
    public String toString() {
        return "Nombre : " + nombre + "\n" +
                "Comuna : " + comuna + "\n";
    }
}

