package exp;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 8, 4, 2};
        String[] stringArray = {"banana", "apple", "cherry", "date"};

        SorterContext sorter = new SorterContext(new AscendingSort());

        sorter.sortArray(intArray);
        System.out.println("After sorting (int): " + Arrays.toString(intArray));
        sorter.sortArray(stringArray);
        System.out.println("After sorting (string): " + Arrays.toString(stringArray));


        sorter.setStrategy(new DescendingSort());
        sorter.sortArray(intArray);
        System.out.println("After sorting (int): " + Arrays.toString(intArray));
        sorter.sortArray(stringArray);
        System.out.println("After sorting (string): " + Arrays.toString(stringArray));
    }
}
