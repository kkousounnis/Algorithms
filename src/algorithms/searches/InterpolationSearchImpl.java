package algorithms.searches;

/**
 *
 * Worst-case performance O(n) Best-case performance O(1) Average perfomance
 * O(log(log(n)))
 */
public class InterpolationSearchImpl implements InterpolationSearch {

    @Override
    public <T extends Comparable<T>> int interPolationSearch(T[] array[], T key1) {
        int startIndex = 0;
        int endIndex = (array.length - 1);
        int key = Integer.parseInt((String)key1);
        while (checkIndex(startIndex, endIndex, key, array)) {
            int position = startIndex
                    + (((endIndex - startIndex) / (array[endIndex] - array[startIndex]))
                    * (key - array[startIndex]));

            if (array[position].equals(key)) {
                return (position);
            }
            int myvalue = Integer.parseInt((String)array[position]);
            if (myvalue < key) {
                startIndex = position + 1;
            } else {
                endIndex = position - 1;
            }

        }
        return (-1);
    }

    private <T extends Comparable<T>> boolean checkIndex(int startIndex, int endIndex,
            int key, int[] array) {
        return (startIndex <= endIndex && key >= array[startIndex] && key <= array[endIndex]);
    }

}
