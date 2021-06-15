package lesson13;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        for (Integer num : a) {
            union.add(num);
        }
        for (Integer num : b) {
            union.add(num);
        }


        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> intersection = new LinkedList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersection.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> unionWithoutDuplicate = new HashSet<>();
     for(Integer num:a) {


         if (a.contains(num)) {
             unionWithoutDuplicate.add(num);
         }
     }
     for (Integer num: b){
         if (b.contains(num)) {
             unionWithoutDuplicate.add(num);
         }
     }
        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

            HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
            for (Integer num : a) {
                if (b.contains(num)) {
                    intersectionWithoutDuplicate.add(num);

                }
            }
            for (Integer num : b) {
                if (a.contains(num)) {
                    intersectionWithoutDuplicate.add(num);
                }
            }

        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> difference = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                difference.add(num);

            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                difference.add(num);

            }
        }
        return difference;
    }
}