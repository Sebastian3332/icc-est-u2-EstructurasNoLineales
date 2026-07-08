import collections.set.Sets;
import collections.set.maps.Maps;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Contacto;
import models.Person;
import structures.graphs.Graph;
import structures.graphs.PathResult;
import structures.graphs.implementations.DFSPathFinder;
import structures.node.Node;
import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.InsertBSTTest;
import trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runPersonTree();
        // runSets();
        // runMaps();
        runGraph();
        runGraph2();

    }

    private static void runSets() {
        Sets sets = new Sets();

        // Primera implementación de Set
        System.out.println("Primera implemetacion de Set");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño del HashSet: " + hashSet.size());
        System.out.println("Contiene 'f': " + hashSet.contains("f"));

        // Segunda implementación de Set LinkedHashSet
        System.out.println("\nSegunda implemetacion de Set");
        Set<String> linkedHashSet = sets.construLinkedHashSet();
        System.out.println(linkedHashSet);
        System.out.println("Tamaño del LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Contiene 'A': " + linkedHashSet.contains("A"));

        // Tercera implementación de Set TreeSet
        System.out.println("\nTercera implemetacion de TreeSet");
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Tamaño del TreeSet: " + treeSet.size());
        System.out.println("Contiene 'A': " + treeSet.contains("A"));

        // Cuarta implementación de Set TreeSet con Contactos y comparador
        System.out.println("\nCuarta implementación de TreeSet con comparador");
        Set<Contacto> treeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println(treeSetConComparador);
        System.out.println("Tamaño del TreeSet con comparador: " + treeSetConComparador.size());

    }

    private static void runIntTree() {

        IntTree arbolNumeros = new IntTree();

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8);
        arbolNumeros.insert(20);
        arbolNumeros.insert(15);

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

        System.out.println("\n--- BASE DEL ARBOL CON ARRAY ---");

        int[] numeros = { 5, 3, 7, 2, 4, 6, 8 };

        InsertBSTTest ejercicioInsert = new InsertBSTTest();

        Node<Integer> root = ejercicioInsert.insert(numeros);

        Ejercicio1 impresor = new Ejercicio1();

        System.out.println("\n--- EJERCICIO 01: INSERT BST ---");
        impresor.printTree(root);

        System.out.println("\n--- EJERCICIO 02: INVERTIR ARBOL ---");

        System.out.println("Arbol original:");
        impresor.printTree(root);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.invert(root);

        System.out.println("\nArbol invertido:");
        impresor.printTree(root);

        System.out.println("\n--- EJERCICIO 03: LISTAR NIVELES ---");

        Ejercicio3 ejercicio3 = new Ejercicio3();

        List<List<Node<Integer>>> niveles = ejercicio3.listLevels(root);

        for (List<Node<Integer>> nivel : niveles) {

            for (int i = 0; i < nivel.size(); i++) {

                System.out.print(nivel.get(i).getValue());

                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
        }

        System.out.println("\n--- EJERCICIO 04: PROFUNDIDAD MAXIMA ---");

        Ejercicio4 ejercicio4 = new Ejercicio4();

        System.out.println(
                "Profundidad: " + ejercicio4.maxDepth(root));
    }

    private static void runPersonTree() {

        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Juan", 30));
        personTree.insert(new Person("Ana", 20));
        personTree.insert(new Person("Pedro", 40));

        System.out.println("\n--- ÁRBOL DE PERSONAS IN-ORDER ---");
        personTree.inOrder();
    }

    private static void runMaps() {
        Maps maps = new Maps();
        maps.construirHashMap();
        maps.coLinkedHashMap();
        maps.eliminarDuplicadosandSort(null);
    }

    private static void runGraph() {

        Graph<String> graph = new Graph<>();

        graph.addEdgeUni("A", "B");
        graph.addEdgeUni("B", "C");
        graph.addEdgeUni("B", "D");
        graph.addEdgeUni("C", "A");
        graph.addEdgeUni("C", "D");
        graph.addEdgeUni("D", "C");
        graph.addEdgeUni("D", "J");
        graph.addEdgeUni("J", "D");
        graph.printGraph();
    }

    private static void runGraph2() {

        Graph<String> graph = new Graph<>();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "J");
        graph.addEdge("D", "E");
        graph.addEdge("E", "F");
        graph.addEdge("K", "J");

        graph.printGraph();

        DFSPathFinder<String> dfs = new DFSPathFinder<>();

        PathResult<String> result = dfs.find(graph, "A", "F");

        System.out.println("\n A -> F");
        System.out.println("Visitados: " + result.getVisitados());
        System.out.println("Camino: " + result.getPath());

        PathResult<String> result2 = dfs.find(graph, "A", "J");

        System.out.println("\n A -> J");
        System.out.println("Visitados: " + result2.getVisitados());
        System.out.println("Camino: " + result2.getPath());

        PathResult<String> result3 = dfs.find(graph, "A", "K");

        System.out.println("\n A -> K");
        System.out.println("Visitados: " + result3.getVisitados());
        System.out.println("Camino: " + result3.getPath());

    }

}
