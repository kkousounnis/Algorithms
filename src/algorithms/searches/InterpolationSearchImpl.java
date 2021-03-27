package algorithms.searches;

import java.util.Arrays;

/**
 *
 * Worst-case performance O(n) 
 * Average perfomance O(log(log(n)))
 * Best-case performance O(1)  * 
 */
public class InterpolationSearchImpl implements InterpolationSearch {

    @Override
    public int interPolationSearch(int array[], int value) {
        Arrays.sort(array);
        int startIndex = 0;
        int endIndex = (array.length - 1);

        while (checkIndex(startIndex, endIndex, value, array)) {
            int position = startIndex
                    + (((endIndex - startIndex) / (array[endIndex] - array[startIndex]))
                    * (value - array[startIndex]));

            if (array[position] == value) {
                return (position);
            }

            if (array[position] < value) {
                startIndex = position + 1;
            } else {
                endIndex = position - 1;
            }

        }
        return (-1);
    }

    private static boolean checkIndex(int startIndex, int endIndex,
            int value, int[] array) {
        return (startIndex <= endIndex
                && value >= array[startIndex] && value <= array[endIndex]);
    }

}
