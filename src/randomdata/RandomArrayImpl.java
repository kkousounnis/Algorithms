package randomdata;

import algorithms.searches.factory.SearchAlgorithmImpl;
import java.util.Random;
import java.util.stream.Stream;
import models.enums.SearchAlgorithmType;

public class RandomArrayImpl {

    Random r = new Random();
    int size = 500;
    int maxElement = 250;

    public void executeSearch(SearchAlgorithmType searchAlgorithmType) {
        Integer[] integers = fakeData();
        /**
         * Print Array uncomment
         */
        //printArray(integers);
        int shouldBeFound = randomNumber(integers);

        SearchAlgorithmImpl search
                = new SearchAlgorithmImpl(searchAlgorithmType);

        int atIndex = search.find(integers, shouldBeFound);
        System.out.println(
                String.format(
                        "\nShould be found: %d. Found %d at index %d. An array length %d",
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

    public void printArray(Integer[] integers) {
        int counter = 0;

        for (Integer number : integers) {
            System.out.print((counter++) + ": " + number);
            if (counter != integers.length) {
                System.out.print(", ");
            }
            if ((counter % 10) == 0) {
                System.out.println("");
            }
        }
    }

}
