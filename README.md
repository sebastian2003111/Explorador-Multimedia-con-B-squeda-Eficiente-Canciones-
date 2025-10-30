# 🎵 Explorador Multimedia con Búsqueda Eficiente (Música)

## 👨‍💻 Autor
**Sebastián Bohórquez**

---

## 🧠 Descripción del Programa
El **Explorador Multimedia con Búsqueda Eficiente (Música)** es una aplicación desarrollada en **Java** que permite **registrar, buscar, listar y eliminar canciones** de manera rápida y eficiente.

Este programa utiliza una **estructura de datos Hashing (Tabla Hash)** para optimizar la búsqueda de canciones según su nombre.  
Gracias a la función hash, las canciones se almacenan en posiciones específicas de la tabla, evitando recorrer listas completas y reduciendo el tiempo de búsqueda.

---

## ⚙️ Funcionalidades Principales

✅ Registrar canciones (nombre, artista, género y año)  
🔍 Buscar canciones por nombre  
🗑️ Eliminar canciones registradas  
📋 Listar todas las canciones almacenadas en la tabla hash  
🚪 Salir del sistema  

El menú del programa es interactivo y permite al usuario ejecutar cada operación desde la consola.

---

## 🧩 Estructura de Datos Usada: **Hashing**

El proyecto implementa una **Tabla Hash** basada en un arreglo de **listas enlazadas (LinkedList)** para manejar posibles colisiones.  
Cada canción se almacena en un índice calculado mediante una función hash aplicada al nombre de la canción.

### 🔢 Funcionamiento:
1. Se aplica la función hash sobre el nombre de la canción.
2. El resultado determina el índice en el arreglo.
3. Si varias canciones caen en el mismo índice, se almacenan en una lista enlazada.
4. Las operaciones de búsqueda, inserción y eliminación tienen un rendimiento promedio de **O(1)**.

---

## 🧱 Estructura del Código

El programa está contenido en un solo archivo Java:

- **Clase `Cancion`** → Define los atributos de una canción.  
- **Clase `TablaHash`** → Implementa la estructura Hashing y sus métodos (`insertar`, `buscar`, `eliminar`, `listar`).  
- **Clase principal `ExploradorMultimedia`** → Contiene el menú principal y la lógica de interacción con el usuario.

---

---

## 🧾 Conclusión
El uso de **Hashing** permite crear un sistema eficiente para organizar grandes catálogos multimedia.  
Este enfoque reduce el tiempo de búsqueda y demuestra la aplicación práctica de las **estructuras de datos avanzadas** en proyectos de programación orientada a objetos.

---

## 🎥 Video Explicativo
📺 Mira el video demostrativo en YouTube:  
🔗 [https://youtu.be/9vhugcyJKjw?feature=shared](https://youtu.be/9vhugcyJKjw?feature=shared)

---

## 💡 Tecnologías Utilizadas
- Lenguaje: **Java**
- IDE: **Visual Studio Code / NetBeans**
- Estructura de Datos: **Hashing (Tabla Hash)**
- Entrada por consola con **Scanner**

---


## 🚀 Ejemplo de Uso

**Ejecución desde consola:**

=== EXPLORADOR DE MÚSICA ===

1.Agregar canción
2.Buscar canción
3.Eliminar canción
4.Listar canciones
0.Salir
Seleccione una opción: 1
Nombre: Lonely
Artista: Justin Bieber
Género: Pop
Año: 2021
 Canción registrada con éxito.
