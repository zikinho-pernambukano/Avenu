package lesson13;

import java.util.Comparator;
// по убыванию метод сориторовка
public class StringReverseComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {


        return -o1.compareTo(o2);
    }
}
