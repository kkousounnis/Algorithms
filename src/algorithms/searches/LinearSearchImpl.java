package algorithms.searches;

import java.util.Random;
import java.util.stream.Stream;

public class LinearSearchImpl implements LinearSearch {
    Random r = new Random();
    int size = 500;
    int maxElement = 250;

    @Override
    public void linearSearch() {
        Integer[] integers = fakeData();      
        int shouldBeFound = randomNumber(integers);
        SearchAlgorithmImpl search = new SearchAlgorithmImpl();
        int atIndex = search.find(integers, shouldBeFound);
        System.out.println(
        String.format(
            "Should be found: %d. Found %d at index %d. An array length %d",
            shouldBeFound, integers[atIndex], atIndex, size));

    }

    private Integer[] fakeData() {

        Integer[] integers
                = Stream.generate(() -> r.nextInt(maxElement)).limit(size).toArray(Integer[]::new);
        return (integers);
    }

    private int randomNumber(Integer[] integers) {
       return (integers[r.nextInt(size - 1)]);
    }

}
