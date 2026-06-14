Llanquihue Tour App - Sistema de Gestión de Catálogo (Semana 4)

Este proyecto es una aplicación de consola desarrollada en Java como actividad sumativa de la Semana 4 para la asignatura Desarrollo Orientado a Objetos I. 

La aplicación resuelve la problemática de la agencia de turismo *Llanquihue Tour* en la Región de Los Lagos, permitiendo gestionar de forma eficiente el inventario de productos turísticos mediante la lectura de archivos planos y la manipulación de colecciones dinámicas.

## Características del Proyecto

- **Persistencia de Datos (.txt):** Lectura automatizada de datos desde un archivo externo (`productos.txt`) procesando atributos delimitados por punto y coma `;`.
- **Colecciones Dinámicas:** Carga e instanciación de objetos en tiempo de ejecución utilizando `ArrayList<Productos>`.
- **Filtros Avanzados (Criterio 4):**
  - **Búsqueda por Palabra Clave:** Implementación de búsqueda parcial insensible a mayúsculas/minúsculas (`.toLowerCase().contains()`).
  - **Control de Inventario Crítico:** Identificación y despliegue automático de productos con disponibilidad limitada (menor a 10 unidades).

📁 Estructura de Paquetes

El proyecto sigue una arquitectura modular y organizada según las directrices académicas:


src/
│
├── app/ o ui/
│   └── Main.java                # Punto de entrada de la aplicación e interfaz de consola.
│
├── model/
│   ├── Productos.java           # Modelo de entidad para los artículos/tours.
│
├── data/
│   └── GestorDeDatos.java       # Manejo del flujo de archivos (BufferedReader y FileReader).
│
│
└── resources/
    └── productos.txt            # Archivo plano con los datos del inventario.

💻 Cómo Ejecutar el Proyecto

1) Crear una carpeta vacía con un nombre para identificar el proyecto (Ejemplo: Llanquihue Tour App)
   - Haz clic derecho dentro de la carpeta, pulsa el botón 'Abrir en terminal'.

2) Una vez en la termina escribe: git clone https://github.com/BraulioVevo/llanquihue-tour.git
   - Una vez se haya clonado el proyecto. 

3) Abre el proyecto en tu IDE preferido.

Asegúrate de que la estructura de archivos mantenga el archivo productos.txt dentro de la ruta especificada en el código (src/resources/productos.txt).

4) Ejecuta la clase Main.java.
