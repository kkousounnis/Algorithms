package algorithms.searches.factory;

import algorithms.searches.BinarySearchImpl;
import algorithms.searches.InterpolationSearchImpl;
import algorithms.searches.LinearSearchImpl;
import models.enums.SearchAlgorithmType;

public class SearchAlgorithmImpl implements SearchAlgorithm {

    private SearchAlgorithmType searchAlgorithmType;
    private LinearSearchImpl linearSearchImpl;
    private BinarySearchImpl binarySearchImpl;
    private InterpolationSearchImpl interPolationSearchImpl;

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
            case INTERPOLATIONSEARCH:
                return interPolationSearchImpl.interPolationSearch( convertToInt(array), Integer.parseInt((String)value));
        }
        return -1;
    }
    
    private <T extends Comparable<T>> int[] convertToInt(T[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt((String)array[i]);
        }
        return (arr);
    }

}
