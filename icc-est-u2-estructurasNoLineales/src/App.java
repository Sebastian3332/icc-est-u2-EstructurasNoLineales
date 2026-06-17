import models.Person;
import structures.node.Node;
import trees.IntTree;
import trees.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();

    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER esperado: 3 5 8 10 15 20
        arbolNumeros.insert(20); /// POSTORDER esperado: 3 8 5 15 20 10
        arbolNumeros.insert(15); /// NIVELES esperado: 10 5 20 3 8 15

        System.out.println("--- RECORRIDO PRE-ORDER ---");
        arbolNumeros.preOrder();

        System.out.println("--- RECORRIDO POST-ORDER ---");
        arbolNumeros.posOrder();

        System.out.println("--- RECORRIDO IN-ORDER ---");
        arbolNumeros.inOrder();

        System.out.println("--- RECORRIDO POR NIVELES ---");
        arbolNumeros.imprimirPorNiveles();

        System.out.println("--- ALTURA DEL ARBOL ---");
        System.out.println("Altura: " + arbolNumeros.getAltura());
    }

    private static void runPersonTree() {

        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person(null, 30));
        personTree.insert(new Person(null, 20));
        personTree.insert(new Person(null, 40));

        System.out.println("\n--- Árbol de Personas In-Order ---");
        personTree.inOrder();
    }
}