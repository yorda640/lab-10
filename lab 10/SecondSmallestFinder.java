package Lab10;

import java.util.Collections;
import java.util.List;

public class SecondSmallestFinder {

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements");
        }

        Collections.sort(list);


        return list.get(1);
    }

    public static void main(String[] args) {

        List<Integer> intList = List.of(5, 2, 8, 1, 7);
        Integer secondSmallestInt = secondSmallest(intList);
        System.out.println("Second Smallest Integer: " + secondSmallestInt);
        List<String> stringList = List.of("apple", "orange", "banana", "grape");
        String secondSmallestString = secondSmallest(stringList);
        System.out.println("Second Smallest String: " + secondSmallestString);
    }
}
