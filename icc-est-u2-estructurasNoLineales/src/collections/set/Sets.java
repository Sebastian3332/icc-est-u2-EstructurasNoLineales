package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {
    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }
    public Set<String> construLinkedHashSet() {
        Set<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");
        return linkedHashSet;
    }
    public Set<String> construirTreeSet() { 
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegegg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");
        return treeSet;
    }
    public Set<Contacto> construirTreeSetConComparador() { 
        Set<Contacto> treeSet = new TreeSet<>((c1, c2) -> { return c1.getNombre().compareTo(c2.getNombre()); });

        treeSet.add(new models.Contacto("Juan", "123456789", "Perez"));
        treeSet.add(new models.Contacto("Ana", "987654321", "Gomez"));
        treeSet.add(new models.Contacto("Pedro", "456789123", "Lopez"));
        treeSet.add(new models.Contacto("Maria", "789123456", "Martinez"));
        treeSet.add(new models.Contacto("Luis", "321654987", "Rodriguez"));
        treeSet.add(new models.Contacto("Juan", "123456789", "Perez"));
        treeSet.add(new models.Contacto("Juan", "123456789", "Lopez"));
        return treeSet;
    }


    public Set<Contacto> construirHashSetConComparador() { 
        Set<Contacto> hashSet = new HashSet<>();

        Contacto c1 = new Contacto("Juan", "123456789", "Perez");
        Contacto c2 = new Contacto("Ana", "987654321", "Gomez");
        hashSet.add(c1);
        hashSet.add(c2);
        Contacto c3 = new Contacto("Pedro", "456789123", "Lopez");
        hashSet.add(c3);
        Contacto c4 = new Contacto("Maria", "789123456", "Martinez");
        hashSet.add(c4);
        Contacto c5 = new Contacto("Luis", "321654987", "Rodriguez");
        hashSet.add(c5);
        Contacto c6 = new Contacto("Juan", "123456789", "Perez");
        hashSet.add(c6);
        Contacto c7 = new Contacto("Juan", "123456789", "Lopez");
        hashSet.add(c7);

        System.out.println("c1" + c1.hashCode());
        System.out.println("c1" + c2.hashCode());
        return hashSet;
    }

}