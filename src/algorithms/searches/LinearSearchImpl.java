package algorithms.searches;

import java.util.Random;
import java.util.stream.Stream;
import models.enums.SearchAlgorithmType;

/**
 *
 * Linear Search Worst-case performance O(n) Best-case performance O(1) Average
 * performance O(n)
 */
public class LinearSearchImpl implements LinearSearch {   

    @Override
    public <T extends Comparable<T>> int linearSearch(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

}
