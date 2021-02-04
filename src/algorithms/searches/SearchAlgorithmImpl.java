package algorithms.searches;

import algorithms.searches.interfaces.SearchAlgorithm;

public class SearchAlgorithmImpl implements SearchAlgorithm{

    @Override
    public <T extends Comparable<T>> int find(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
            
        }
        return -1;
    }
    
    

}
