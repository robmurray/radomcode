package com.wmb.algorithms.sorting;

/**
 * Insertion Sort
 *
 * Efficient on small data sets
 *
 * divides the input sequence into 2 parts left side (sorted) right (unsorted)
 * iterates through the input sequence, consuming one element at a time
 * inserting sorted items to correct position on the left
 *
 */
public class InsertionSort  implements SortInterface {


    public InsertionSort() {

    }

    public int[] sort(int[] targetArray) {
        int currentElement=0;
        int innerCounter=0;
        for(int counter=1;counter<targetArray.length;counter++){

            currentElement= targetArray[counter];

            innerCounter=counter;

            while(innerCounter>0 && targetArray[innerCounter -1]>currentElement){

                targetArray[innerCounter]=targetArray[innerCounter-1];
                innerCounter=innerCounter-1;
                targetArray[innerCounter]=currentElement;
            }
        }
        return targetArray;
    }
}
