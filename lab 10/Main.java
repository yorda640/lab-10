package Lab10;

import java.util.List;

public class Main {
    public static <T> boolean contains(List<T> list, T item) {
        for (T x : list) {
            if (x == null && item == null) return true;
            if (item == null || x == null) continue;
            if (x.equals(item)) return true;
        }
        return false;
    }


    public static void test() {
        List<String> stringList = List.of("Bob", "Joe", "Tom");
        boolean resultString = contains(stringList, "Tom");
        System.out.println("Contains String? " + resultString);


        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        boolean resultInt = contains(intList, 3);
        System.out.println("Contains Integer? " + resultInt);
    }

    public static void main(String[] args) {
        test();
    }
}
