import java.util.ArrayList;

public class ArrayOfSomething<T> {
    T[] array = (T[]) new Object[100];
    ArrayOfSomething(T[] array) {
        for (int i = 0; i < array.length; i++)
            this.array[i] = array[i];
    }

    T getElement(Integer index) {
        return array[index];
    }

    void toList(ArrayList<T> list) {
        for (T t : array)
            list.add(t);
        if (array.length >= 5) {
            for (int i = 0; i < 5; i++)
                System.out.println(list.get(i));
        } else {
            for(int i = 0; i < array.length; i++)
                System.out.println(list.get(i));
        }
    }
}
