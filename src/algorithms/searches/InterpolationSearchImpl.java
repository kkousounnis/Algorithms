package algorithms.searches;

/**
 *
 * Worst-case performance O(n) Best-case performance O(1) Average perfomance
 * O(log(log(n)))
 */
public class InterpolationSearchImpl implements InterpolationSearch {

    @Override
    public int interPolationSearch(int array[], int key) {
        int startIndex = 0;
        int endIndex = (array.length - 1);

        while (checkIndex(startIndex, endIndex, key, array)) {
            int position = startIndex
                    + (((endIndex - startIndex) / (array[endIndex] - array[startIndex]))
                    * (key - array[startIndex]));

            if (array[position] == key) {
                return (position);
            }

            if (array[position] < key) {
                startIndex = position + 1;
            } else {
                endIndex = position - 1;
            }

        }
        return (-1);
    }

    private static boolean checkIndex(int startIndex, int endIndex,
            int key, int[] array) {
        return (startIndex <= endIndex
                && key >= array[startIndex] && key <= array[endIndex]);
    }

}
