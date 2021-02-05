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
    public <T extends Comparable<T>> int binarySearch(T[] array, T key, int left, int right) {
        if (right < left) return -1; //the key can't be found 
        
        //find median
        int median = (left + right) >>> 1;
        
        int comp = key.compareTo(array[median]);
        
        if (comp == 0){
            return median;
        }else if (comp < 0){
            return binarySearch(array, key, left, median - 1);
        }else{
            return binarySearch(array, key, median+1, right);
        }
    }
    
}
