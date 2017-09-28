package com.wmb.algorithms.sorting;

/**
 * Algorithm

 1) find the smallest (or largest element in the unsorted sub-list,
 2) swap it with the leftmost unsorted element
 3) increment the sub-list index
 * Created by robertmurray on 8/22/17.
 */
public class SelectionSortPrep {

    public int[] sort(int[] unsorted){
        if(unsorted == null || unsorted.length<2){
            return unsorted;
        }
        int [] sorted = new int[unsorted.length];
        int sortedIndex =0;

        int indexOfSmallest = 0;
        for(int index = 0;index<unsorted.length;index++){
            if(unsorted[index]<unsorted[indexOfSmallest]){
                indexOfSmallest = index;
            }
        }

        sorted[sortedIndex] = unsorted[indexOfSmallest];
        //`unsorted[indexOfSmallest]=;
        return sorted;
    }

}
