package algorithms.searches;

/**
 * 
 * Binary Search 
 * Worst-case performance O(log n) 
 * Best-case performance O(1)
 * Average performance O(log n)
 */

public class BinarySearchImpl implements BinarySearch{

    @Override
    public <T extends Comparable<T>> int binarySearch(T[] array, T value, int left, int right) {
        if (right < left) return -1; //the key can't be found 
        
        //find median
        int median = (left + right) >>> 1;
        
        int comp = value.compareTo(array[median]);
        
        if (comp == 0){
            return median;
        }else if (comp < 0){
            return binarySearch(array, value, left, median - 1);
        }else{
            return binarySearch(array, value, median+1, right);
        }
    }
    
}
