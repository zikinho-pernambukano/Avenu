package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        HashSet<Integer> b = new HashSet<>();
        b.add(8);
        b.add(9);
        b.add(10);
        b.add(11);
        b.add(12);
/*
        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> difference = utils.difference(a, b);
        System.out.println(difference);
*/
        CollectionUtilsImpl utils1 = new CollectionUtilsImpl();
        Collection<Integer> union = utils1.union(a, b);
        System.out.println(union);

        CollectionUtilsImpl utils2 = new CollectionUtilsImpl();
        Collection<Integer> intersection = utils2.intersection(a, b);
        System.out.println(intersection);

        CollectionUtilsImpl utils3 = new CollectionUtilsImpl();
        Collection<Integer> unionWithoutDuplicate = utils3.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate);


        CollectionUtilsImpl utils4 = new CollectionUtilsImpl();
        Collection<Integer> intersectionWithoutDuplicate = utils4.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicate);
    }

}
