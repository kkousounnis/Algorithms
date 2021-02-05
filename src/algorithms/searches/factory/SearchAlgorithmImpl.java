package algorithms.searches.factory;

import algorithms.searches.BinarySearchImpl;
import algorithms.searches.LinearSearchImpl;
import models.enums.SearchAlgorithmType;

public class SearchAlgorithmImpl implements SearchAlgorithm {

    private SearchAlgorithmType searchAlgorithmType;
    private LinearSearchImpl linearSearchImpl;
    private BinarySearchImpl binarySearchImpl;

    public SearchAlgorithmImpl() {
    }

    public SearchAlgorithmImpl(SearchAlgorithmType searchAlgorithmType) {
        this.searchAlgorithmType = searchAlgorithmType;
        this.linearSearchImpl = new LinearSearchImpl();
    }

    @Override
    public <T extends Comparable<T>> int find(T[] array, T value) {

        switch (this.searchAlgorithmType) {
            case LINEARSEARCH:
                return linearSearchImpl.linearSearch(array, value);
            case BINARYSEARCH:
                return binarySearchImpl.binarySearch(array, value, 0, array.length);
        }
        return -1;
    }

}
