package algorithms.searches;

import java.util.Arrays;

/**
 * Worst-case performance O(√n)
 * Average perfomance O(√n)
 * Best-case performance O(1)
 */
public class JumpSearchImpl implements JumpSearch {

    @Override
    public <T extends Comparable<T>> int jumpSearch(T[] array, T value) {
        Arrays.sort(array);        
        int length = array.length;
        int blockSize = (int) Math.sqrt(length);
        /*block size to be jumped*/

        int limit = blockSize;
        while (value.compareTo(array[limit]) > 0 && limit < array.length - 1) {
            limit = Math.min(limit + blockSize, array.length - 1);
        }
        
        for (int i = limit - blockSize; i <= limit; i++) {
            if (array[i] == value) {
                return (i);
            }
        }
        return (-1);
    }
}
