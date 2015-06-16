package com.wmb.algorithms.search;

/**
 * the first impl that came to mind see BinarySearch for slightly cleaner example
 * Created by rob on 6/16/15.
 */
public class BinarySearch2 {

    /**
     *
     * returns null if target value is not found
     *
     * @param sortedArray
     * @return
     */
    public Integer search(Integer[] sortedArray, Integer targetValue){
        Integer theValueToReturn = null;

        if(targetValue == null || sortedArray== null || sortedArray.length<1){
            return null;
        }

        // compare with middle value
        int index = 0;
        if(sortedArray.length>1) {
            index = sortedArray.length / 2;
        }

        int valueToTest =sortedArray[index];

        // compare
        if(valueToTest==targetValue){
            // all done
            return valueToTest;
        }
        if(sortedArray.length==1){
            // no matches
            return null;
        }


        if(targetValue>valueToTest){

            theValueToReturn =search(splitArray(sortedArray,index, sortedArray.length),targetValue);
        }else if(targetValue<valueToTest){
            theValueToReturn =search(splitArray(sortedArray,0,index),targetValue);
        }


        return theValueToReturn;
    }

    public Integer[] splitArray(Integer[] theArray, int startIndex, int endIndex){
        // check index ranges
        // check array size and for null array

        Integer[] newArray = new Integer[endIndex-startIndex];
        int newArrayIndex = 0;
        for(int index=startIndex;index<endIndex;index++){
            newArray[newArrayIndex++]=theArray[index];
        }
        return newArray;
    }



}
