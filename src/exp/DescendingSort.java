package exp;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("\nSorting integers in descending order:\n");
        Arrays.sort(array);
        reverse(array);
    }

    @Override
    public void sort(String[] array) {
        System.out.println("Sorting strings in reverse alphabetical order:");
        Arrays.sort(array, Collections.reverseOrder());
    }

    private void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
