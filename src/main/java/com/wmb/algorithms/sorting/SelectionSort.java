package com.wmb.algorithms.sorting;

/**
 * Selection sort O(n^2) time complexity.
 *
 * The list is divided into two parts: items already sorted, item to be sorted. The sorted sub-list is
 * built left to right starting at index =0. initially the sorted sub list will be empty.
 *
 * Algorithm
 *
 *  1) find the smallest (or largest element in the unsorted sub-list,
 *  2) swap it with the leftmost unsorted element
 *  3) increment the sub-list index
 *
 *
 */


public class SelectionSort {

    public SelectionSort() {
    }

    public int[] sort(int[] targetArray) {

        int minIndex, temp;
        int targetArrayLength = targetArray.length;

        for (int sortedSublistIndex = 0; sortedSublistIndex < targetArrayLength - 1; sortedSublistIndex++) {

            minIndex = sortedSublistIndex;

            for (int notSortedIndex = sortedSublistIndex + 1; notSortedIndex < targetArrayLength; notSortedIndex++) {
                if (targetArray[notSortedIndex] < targetArray[minIndex]) {
                    minIndex = notSortedIndex;
                }
            }

            if (minIndex != sortedSublistIndex) {
                temp = targetArray[sortedSublistIndex];
                targetArray[sortedSublistIndex] = targetArray[minIndex];
                targetArray[minIndex] = temp;
            }

        }

        return targetArray;
    }

}
