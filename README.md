# 📚 Sistema de Gestión de Biblioteca

Este proyecto es una aplicación de consola desarrollada en Java que permite gestionar libros, autores, usuarios y préstamos dentro de una biblioteca.

## 🎯 Objetivos del proyecto

- Aplicar los fundamentos de la Programación Orientada a Objetos (POO):
    - Abstracción
    - Herencia
    - Polimorfismo
    - Agregación
    - Composición
- Utilizar lambdas, streams y Optional para procesar datos.

## 🧩 Estructura del sistema

### Clases principales

- `Persona` (abstracta): nombre, DNI, email.
- `Usuario`: hereda de Persona, representa al lector.
- `Autor`: representa al autor del libro (composición con `Libro`).
- `Libro`: título, autor, disponibilidad.
- `Prestamo`: relación entre libro y usuario (agregación).

## 🧠 Funcionalidades

- Registrar libros con su autor.
- Registrar usuarios.
- Prestar libros a usuarios.
- Ver lista de libros disponibles y prestados.
- Buscar libros por título o autor usando Optional.
- Mostrar información de usuarios y libros.

## 🛠️ Tecnologías

- Java 17+
- Colecciones (`List`, `Map`)
- `Optional`, `Stream`, `Lambda`

## 🧪 Conceptos prácticos usados

| Concepto       | Aplicación                                |
|----------------|--------------------------------------------|
| Abstracción    | Clase abstracta `Persona`                 |
| Herencia       | `Usuario` hereda de `Persona`            |
| Polimorfismo   | Método `mostrarDatos()` implementado     |
| Agregación     | `Prestamo` contiene `Libro` y `Usuario`  |
| Composición    | `Libro` contiene un `Autor` exclusivo    |
| Lambdas        | Búsqueda de libros disponibles            |
| Optional       | Buscar libros por título o autor          |
| Stream API     | Filtrar, ordenar, mapear datos            |

## 📦 Estructura del código
```text
src/ 
├── model/ │ 
├── Persona.java │
 ├── Usuario.java │ 
 ├── Autor.java │ 
 ├── Libro.java │ 
 └── Prestamo.java 
 └── Main.java
```

## 🧑‍💻 Cómo usar

1. Ejecutar `Main.java`.
2. Se mostrarán opciones para:
    - Registrar libros y usuarios.
    - Realizar préstamos.
    - Consultar estado de los libros.
3. El sistema gestionará automáticamente los estados de los libros y guardará la información en memoria.

## ✅ Estado del proyecto

✅ Finalizado como proyecto de práctica.

## 📚 Créditos

Proyecto adaptado para practicar los fundamentos de la programación orientada a objetos y el uso moderno de colecciones en Java.
