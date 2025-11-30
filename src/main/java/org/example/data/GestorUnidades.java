package org.example.data;

import org.example.model.CentroCultivo;
import org.example.model.PlantaProceso;
import org.example.model.UnidadOperativa;

/**
 * Crea y administra unidades operativas utilizando herencia simple
 * y polimorfismo.
 * Muestra los datos organizados en consola.
 */
public class GestorUnidades {

    /**
     * Crea instancias de centros de cultivo y plantas de proceso
     * y las imprime separadas por tipo.
     */
    public void crearUnidades() {

        // Instanciación de centros de cultivo utilizando polimorfismo.
        UnidadOperativa centro1 = new CentroCultivo("Centro AquaChile",
                "Quellon", 200000.0);
        UnidadOperativa centro2  = new CentroCultivo("Centro Salmones Austral",
                "Calbuco", 60000.0);

        // Instanciación de  plantas de proceso utilizando la misma referencia padre.
        UnidadOperativa planta1= new PlantaProceso("Planta Camanchaca",
                "Calbuco", 140000.0);
        UnidadOperativa planta2 = new PlantaProceso("Planta AquaChile",
                "Quellón", 110000.0);

        // Impresión separada por tipo de unidad operativa.
        System.out.println("=== CENTROS DE CULTIVO ===");
        System.out.println(centro1);
        System.out.println(centro2);

        System.out.println("=== PLANTAS DE PROCESO ===");
        System.out.println(planta1);
        System.out.println(planta2);
    }
}


