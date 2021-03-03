package main;

import models.enums.SearchAlgorithmType;
import randomdata.RandomArrayImpl;

public class Main {

    public static void main(String[] args) {
        /**
         * LinearSearch Example          
         */
        RandomArrayImpl searchExecution = new RandomArrayImpl();
        System.out.println("Linear Search:");
        searchExecution.executeSearch(SearchAlgorithmType.LINEARSEARCH);
        
        System.out.println("Jump Search:");
        searchExecution.executeSearch(SearchAlgorithmType.JUMPSEARCH);
        
        System.out.println("Binary Search:");
        searchExecution.executeSearch(SearchAlgorithmType.BINARYSEARCH);
        
    }
    
}
