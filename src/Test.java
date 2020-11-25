import java.util.ArrayList;

public class Test {

    static <T> void toList(ArrayList<T> list, T[] arr) {
        for (T t : arr)
            list.add(t);
    }

    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D", "E", "F"};
        Integer[] integ = {1, 2, 3, 4, 5};
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        toList(strings, str);
        System.out.println(strings);
        toList(integers, integ);
        System.out.println(integers);

        ArrayOfSomething<String> arr = new ArrayOfSomething<>(str);
        System.out.println(arr.getElement(2));
        arr.toList(strings);
    }

}
