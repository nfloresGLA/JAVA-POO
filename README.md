# Programación Orientada a Objetos (POO) - EducaciónIT

Proyecto integrador desarrollado en Java, organizado en tres desafíos progresivos para practicar modelado orientado a objetos, herencia y abstracción.

## Contenido

- `challenge/one`: sistema de calibración y clasificación de envases.
- `challenge/two`: sistema de gestión académica de alumnos y profesores.
- `challenge/three`: sistema de productos bancarios.
- `modules/`: PDFs con el material de cada módulo.
- `src/uml/`: diagramas UML de los ejercicios.

## Estructura del proyecto

- `src/challenge/one`
- `src/challenge/two`
- `src/challenge/three`
- `src/uml`
- `modules`

## Resumen por etapa

1. **Challenge 01**: modelado base de clases para los casos planteados.
2. **Challenge 02**: implementación de lógica de negocio en cada dominio.
3. **Challenge 03**: refactor con herencia, clases abstractas y ajustes de diseño UML.

## Ejecución rápida (desde la raíz)

Compilar todo el código:

`javac -d out src/challenge/one/*.java src/challenge/two/*.java src/challenge/three/*.java`

Ejecutar tests de ejemplo:

- `java -cp out challenge.one.Test`
- `java -cp out challenge.two.Test`
- `java -cp out challenge.three.Test`