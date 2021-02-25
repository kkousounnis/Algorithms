package algorithms.sorts;

public interface QuickSort {

    public <T extends Comparable<T>> T[] partition(T arr[], int low, int high);

    public <T extends Comparable<T>> T[] quickSort(T arr[], int low, int high);
}
