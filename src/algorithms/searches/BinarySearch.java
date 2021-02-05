package algorithms.searches;

public interface BinarySearch {   
    public <T extends Comparable<T>> int binarySearch(T array[], T key, int left, int right); 
}
