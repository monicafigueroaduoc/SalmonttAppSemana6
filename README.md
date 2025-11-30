## Autor del proyecto
_**Nombre completo:** Mónica Figueroa
_**Sección:** 2
_**Analista Programador Computacional**

---

## Descripción general del proyecto

El proyecto SalmonttAppSemana6 es una aplicación desarrollada en Java que modela entidades reales de la industria salmonera chilena aplicando conceptos fundamentales de Programación Orientada a Objetos tales como;

- Herencia simple.
- Encapsulamiento.
- Sobrescritura de métodos.
- Polimorfismo.
- Organización lógica mediante paquetes.

## Objetivos del proyecto

1. Diseñar una jerarquía de clases utilizando **herencia simple**, creando una superclase `UnidadOperativa`con atributos comunes nombre y comuna.
2. Crear dos subclases:
- `CentroCultivo`, que incorpora la producción anual en toneladas.
- `PlantaProceso`, que incorpora la capacidad anual en toneladas.
3. **Aplicar `super(...)`en los constructores** y **sobrescribir `toString()`** en las subclases para mostrar toda la información correspondiente.
4. **Organizar el proyecto por responsabilidad** en los paquetes solicitados:
- `model/` -> Jerarquía de clases.
- `data/`-> Creación de instancias de prueba.
- `ui/` -> Ejecución del programa.
5. Demostrar el uso de polimorfismo sin listas, utilizando referencias del tipo UnidadOperativa.
6. Crear instancias de prueba**, al menos dos objetos de cada subclase desde `GestorUnidades`y **mostrar los resultados en consola** desde `Main`.


## Descripción de paquetes
### `ui/`
Contiene la clase `Main`, que ejecuta el programa y muestra los resultados.
### `data/`
Incluye `GestorUnidades`, responsable de crear las instancias de prueba de cada subclase y enviarlas a consola.
### `model/`, Contiene toda la jerarquía de clases:
- `UnidadOperativa` (superclase)
- `CentroCultivo` (subclase)
- `PlantaProceso`

## Estructura del proyecto
```SalmonttAppSumativa2
├ .idea/
├ .mvn/
├ docs/
├ src/
|  └ main/
|     ├ java/
|     |  └ org.example/
|     |     ├ data/
|     |     |  └ GestorUnidades.java
|     |     ├ model/
|     |     |  ├ CentroCultivo.java
|     |     |  ├ PlantaProceso.java
|     |     |  ├ UnidadOperativa.java
|     |     ├ ui/
|     |     |  └ Main.java
|     └ resources/
├ test/
├ target/
├ .gitignore
├ pom.xml
└ README.md
```

## Instrucciones para clonar y ejecutar el proyecto
1. Clonar el repositorio desde GitHub.
```bash
Git clone [https://github.com/monicafigueroaduoc/SalmonttAppSemana6.git]
```
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecutar la clase org.example.ui.Main.java
4. Salida por consola:
- Encabezado de centros de cultivo.
- Primer centro de cultivo.
- Segundo centro de cultivo.
- Encabezado de plantas de proceso.
- Primera planta de proceso.
- Segunda planta de proceso.




