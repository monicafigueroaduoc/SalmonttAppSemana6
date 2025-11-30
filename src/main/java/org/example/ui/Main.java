package org.example.ui;

import org.example.data.GestorUnidades;

/**
 * Punto de entrada del sistema.
 * Inicializa el gestor y ejecuta la creación de unidades.
 */
public class Main {
    public static void main(String[] args) {

        // Crear el gestor encargado de administrar las unidades operativas.
        GestorUnidades gestor = new GestorUnidades();

        // Ejecutar la creación de unidades y mostrar sus detalles en consola.
            gestor.crearUnidades();
    }

}
