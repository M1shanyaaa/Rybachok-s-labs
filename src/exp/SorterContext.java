package exp;

public class SorterContext {
    private SortingStrategy strategy;

    public SorterContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }

    public void sortArray(String[] array) {
        strategy.sort(array);
    }
}
