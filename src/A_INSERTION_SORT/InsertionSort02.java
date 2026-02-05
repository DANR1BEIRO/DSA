package A_INSERTION_SORT;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort02 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(6, 3, 5, 7, 1, 8));
        System.out.println("Original array: " + array);

        for (int i = 1; i < array.size(); i++) {
            int key = array.get(i);
            int j = i - 1;

            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }

        System.out.println("Array sorted: " + array);
    }
}
