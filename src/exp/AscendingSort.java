package exp;
import java.util.Arrays;

public class AscendingSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("\nSorting integers in ascending order:\n");
        Arrays.sort(array); // Сортування чисел за зростанням
    }

    @Override
    public void sort(String[] array) {
        System.out.println("Sorting strings alphabetically:");
        Arrays.sort(array); // Сортування слів за алфавітом
    }
}
