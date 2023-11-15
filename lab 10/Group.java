package Lab10;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {
    private T specialElement;
    private List<T> elements = new ArrayList<>();

    public Group(T special, List<T> elements) {
        this.specialElement = special;
        this.elements = elements;
    }

    public T getSpecialElement() {
        return specialElement;
    }

    public List<T> getElements() {
        return elements;
    }


    @Override
    public String toString() {
        return "Group{" +
                "specialElement=" + specialElement +
                ", elements=" + elements +
                '}';
    }

    public static <T> Group<T> copy(Group<T> group) {
        List<T> elements = new ArrayList<>(group.getElements());
        T specialElement = group.getSpecialElement();
        return new Group<>(specialElement, elements);
    }

    public static void main(String[] args) {

        List<Integer> intList = List.of(1, 2, 3, 4);
        Group<Integer> originalGroup = new Group<>(1, intList);


        Group<Integer> copiedGroup = Group.copy(originalGroup);
        System.out.println("Original Group: " + originalGroup);
        System.out.println("Copied Group: " + copiedGroup);
    }
}
