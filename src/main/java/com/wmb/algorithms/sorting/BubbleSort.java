package com.wmb.algorithms.sorting;

public class BubbleSort {

    public BubbleSort() {
    }

    public int[] bubbleSort(int[] targetArray) {
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
