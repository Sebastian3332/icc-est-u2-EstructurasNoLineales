package trees;

import java.util.LinkedList;
import java.util.Queue;
import structures.node.Node;

// Clase que representa un arbol binario de enteros (BST)
public class IntTree {

    private Node<Integer> root;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        root = new Node<Integer>(value);
    }

    public void insert(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
    }

    public void insert(Node<Integer> value) {
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO DE BÚSQUEDA
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // Validar si es mayor o menor y decidir si ingresa a la izquierda o derecha
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    // --- RECORRIDO PRE-ORDER ---
    public void preOrder() {
        preOrderRecursivo(root);
        System.out.println(); // Salto de línea al terminar el recorrido
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        System.out.print(actual.getValue() + " "); // ¡CORREGIDO! .getValue() en lugar de actual
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    // --- RECORRIDO POS-ORDER ---
    public void posOrder() {
        posOrderRecursivo(root);
        System.out.println(); // Salto de línea al terminar el recorrido
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual.getValue() + " "); // ¡CORREGIDO! .getValue() en lugar de actual
    }

    // --- RECORRIDO IN-ORDER ---
    public void inOrder() {
        inOrderRecursivo(root);
        System.out.println();
    }

    private void inOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        inOrderRecursivo(actual.getLeft());
        System.out.print(actual.getValue() + " ");
        inOrderRecursivo(actual.getRight());
    }

    // --- RECORRIDO POR NIVELES (BFS) ---
    public void imprimirPorNiveles() {
        if (root == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);

        System.out.print("Recorrido por Niveles: ");

        while (!cola.isEmpty()) {
            Node<Integer> actual = cola.poll();

            System.out.print(actual.getValue() + " ");

            if (actual.getLeft() != null) {
                cola.add(actual.getLeft());
            }

            if (actual.getRight() != null) {
                cola.add(actual.getRight());
            }
        }
        System.out.println();
    }

    // --- CALCULO DE ALTURA ---
    public int getAltura() {
        return getAlturaRecursivo(this.root);
    }

    private int getAlturaRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return 0;
        }

        int alturaIzquierda = getAlturaRecursivo(actual.getLeft());
        int alturaDerecha = getAlturaRecursivo(actual.getRight());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }
}