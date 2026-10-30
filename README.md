# Diccionario Español-Inglés

Práctica de **lógica de programación** en Java que crea un mini diccionario Español-Inglés y pone a prueba al usuario con 5 palabras seleccionadas aleatoriamente.

## Descripción

El programa utiliza un `HashMap` para almacenar 20 pares de palabras en español y su traducción al inglés. Al ejecutarse:

1. Mezcla aleatoriamente las palabras en español.
2. Selecciona 5 palabras para la práctica.
3. Solicita al usuario la traducción al inglés de cada una.
4. Compara la respuesta con la traducción almacenada en el diccionario.
5. Muestra al final el número de respuestas correctas e incorrectas.

## Tecnologías

- Java
- `HashMap` para almacenar los pares de palabras
- `ArrayList` y `Collections.shuffle()` para seleccionar palabras al azar
- `Scanner` para leer la entrada del usuario

## Cómo ejecutarlo

1. Clona este repositorio:

   ```bash
   git clone https://github.com/Zeth-DG/logica-programacion-5.git
   ```

2. Entra a la carpeta del proyecto:

   ```bash
   cd logica-programacion-5
   ```

3. Compila el programa:

   ```bash
   javac DiccionarioApp.java
   ```

4. Ejecútalo:

   ```bash
   java DiccionarioApp
   ```

## Ejemplo de uso

```text
Bienvenida al diccionario. Empecemos con la practica
¿Cómo se escribe la palabra perro en inglés?
Ingresa la palabra en inglés: 
dog
Excelente, la respuesta es correcta!
...
Tus resultados fueron: 
Palabras correctas: 4
Palabras incorrectas: 1
¡Hasta la próxima!
```

## Posibles mejoras

- Ignorar mayúsculas, minúsculas y espacios adicionales en las respuestas.
- Validar entradas vacías.
- Permitir repetir la práctica sin volver a ejecutar el programa.
- Mostrar un porcentaje de aciertos al final.
- Aumentar el número de palabras.
- Agregar una interfaz de usuario más agradable. 

## Autora

Lizeth Dorantes
