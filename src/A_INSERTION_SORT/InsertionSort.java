package A_INSERTION_SORT;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(5, 2, 4, 6, 1, 3));
        ArrayList<String> names = new ArrayList<>(List.of("goku", "akira", "bulma", "esmeralda", "diamante"));
        go(array);
        go(names);
    }

    static <T extends Comparable<T>> void go(List<T> array) {
        for (int i = 1; i < array.size(); i++) { // starts the loop from the second element (idx 1), because idx 0 is already a sorted list with one element
            T key = array.get(i); // starts with 2
            int j = i - 1; // starts AT index 0 (element 5, greater than key)
            T j_element = array.get(j);

            while (j >= 0 && array.get(j).compareTo(key) > 0) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
            System.out.println(array);
        }
    }
}
