package com.wmb.algorithms.sorting;

/**
 * Bubble sort
 *
 * probably the worst performing of the traditional sorting algorithms.
 *      O(n^2) time complexity
 *
 *
 */
public class BubbleSort  implements SortInterface{

    public BubbleSort() {
    }

    public int[] sort(int[] targetArray) {
        if (targetArray == null || targetArray.length == 0) {
            return targetArray;
        }

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int index = 0; index < targetArray.length - 1; index++) {
                if (targetArray[index] > targetArray[index + 1]) {

                    // not done yet
                    isSorted = false;

                    // swap the values
                    int a = targetArray[index];
                    int b = targetArray[index + 1];
                    targetArray[index + 1] = a;
                    targetArray[index] = b;
                }
            }
        }

        return targetArray;
    }
}
