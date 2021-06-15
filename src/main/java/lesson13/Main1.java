package lesson13;

import java.util.TreeSet;

public class Main1 {

    public static void main(String[] args) {
        //сортирует по возрастанию


        TreeSet<String> treeSet = new TreeSet<>(new StringReverseComparator());
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("e");

        System.out.println(treeSet);
    }
}
