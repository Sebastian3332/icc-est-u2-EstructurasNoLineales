# Práctica 4 – Arboles Binarios y Arboles Binarios de Busqueda (BST)

## Estudiante:
Sebastian Arenillas

## Asignatura:
Estructura de Datos – 2do Interciclo

---

# Descripción general del proyecto

En esta practica se trabajo con arboles binarios y arboles binarios de busqueda (BST) en Java.

La idea principal fue entender como funcionan las estructuras no lineales, especialmente como se organizan los datos de forma jerarquica.

Se implementaron 4 ejercicios:

- Insertar valores en un BST
- Invertir un arbol binario
- Recorrer el arbol por niveles
- Calcular la profundidad del arbol

Todo esto usando nodos y recursividad.

---

# Ejercicio 01: Insertar en BST

## Método: insert(int[] numeros)

Este método recibe un arreglo de numeros y construye un arbol binario de busqueda.

### Cómo funciona:
- El primer valor se usa como raiz del arbol.
- Si un numero es menor, va a la izquierda.
- Si es mayor, va a la derecha.
- Esto se repite hasta ubicar cada valor en su lugar.


## Captura de consola

![alt text](image-8.png)

### Ejemplo de entrada:
```java
int[] numeros = {5, 3, 7, 2, 4, 6, 8};

Resultado:

Se forma un arbol ordenado automáticamente según las reglas del BST.

Ejercicio 02: Invertir arbol binario
Método: invertTree(Node root)

Este método invierte el arbol.

Que hace:

Básicamente intercambia los hijos izquierdo y derecho de cada nodo.

Idea:

Si un nodo tenía un hijo izquierdo, ahora lo tiene a la derecha y viceversa.

Se hace con recursividad hasta recorrer todo el arbol.

Ejercicio 03: Listar niveles
Método: listLevels(Node root)

Este ejercicio recorre el arbol por niveles.

Cómo funciona:
Se usa una cola (Queue)
Se recorre nivel por nivel
Cada nivel se guarda en una lista
Resultado:

Se puede ver el arbol organizado por filas, como niveles.

Ejemplo:

5
3 -> 7
2 -> 4 -> 6 -> 8
Ejercicio 04: Profundidad maxima
Método: maxDepth(Node root)

Este metodo calcula qué tan “alto” es el arbol.

Cómo funciona:
Recorre el arbol por recursión
Compara el lado izquierdo y derecho
Se queda con el mayor

Al final devuelve la cantidad de niveles del arbol.

Código principal (App.java)

El arbol se construye con este arreglo:

int[] numeros = {5, 3, 7, 2, 4, 6, 8};

Luego se llama al método de insercion:

InsertBSTTest ejercicioInsert = new InsertBSTTest();
Node<Integer> root = ejercicioInsert.insert(numeros);
Evidencias de ejecución
Ejercicio 01

Se muestra el arbol BST generado desde el arreglo.

Ejercicio 02

Se ve el arbol antes y después de invertirlo.

Ejercicio 03

Se imprimen los nodos por niveles.

Ejercicio 04

Se muestra la profundidad total del arbol.


Repositorio

Link del repositorio:

https://github.com/Sebastian3332/icc-est-u2-EstructurasNoLineales.git


Conclusion

Con esta practica se entiende mejor cómo funcionan los arboles binarios.

No es solo teoria, sino que se ve como los datos se organizan de forma real en forma de estructura.

La parte mas importante fue entender la recursividad, porque casi todos los ejercicios dependen de eso.

Tambien se vio que los arboles ayudan a organizar datos de manera más eficiente que una lista normal.







