# Resumen
Este proyecto consiste en una aplicación de consola en Java dividida en módulos independientes para ilustrar el almacenamiento y recuperación de información comercial (Producto). El objetivo principal del ejercicio es aprender a serializar una colección completa (ArrayList) en un único bloque de bytes, recuperarla de forma segura y aplicar filtros lógicos sobre los atributos de los objetos reconstituidos.

## Características
Serialización en Bloque: En lugar de serializar los objetos uno por uno en un bucle, el programa guarda la estructura de datos completa (List<Producto>) de una sola vez, manteniendo la indexación y el orden original.

Control de Versiones de Clase (serialVersionUID): Incorpora un identificador estático único en la clase modelo para garantizar la compatibilidad binaria entre los procesos de lectura y escritura, evitando errores si la estructura de la clase cambia en el futuro.

Recuperación con Cast Explicito: Reconstituye el flujo binario del archivo productos.dat y lo transforma de nuevo a una colección Java mediante un moldeo de tipo (type casting).

Filtrado Condicional de Atributos: Analiza la colección recuperada en memoria y aplica un umbral numérico (precio > precioMinimo) para discriminar qué datos mostrar por pantalla.
