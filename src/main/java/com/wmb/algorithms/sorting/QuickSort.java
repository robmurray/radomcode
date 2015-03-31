package com.wmb.algorithms.sorting;

/**
 * Quick sort
 * efficient sorting algorithm but unstable
 *
 * Algorithm
 *
 */


public class QuickSort implements SortInterface {

    public QuickSort() {
    }

    @Override
    public int[] sort(int[] targetArray) {
        return quickSort(targetArray,1 ,2 );
    }


    private int[] quickSort(int[] targetArray, int low, int hi){
        if(low<hi){


        }

        return null;
    }

        /*

        quicksort(A, lo, hi)
    if lo < hi
        p := pivot(A, lo, hi)
        left, right := partition(A, p, lo, hi)  // note: multiple return values
        quicksort(A, lo, left)
        quicksort(A, right, hi)
         */



}
