package com.wmb.algorithms.search;

import java.util.Arrays;

/**
 * Created by rob on 6/16/15.
 */
public class BinarySearch {

    /**
     *
     * returns the index of the target value if found
     *
     * @param theArray
     * @param targetValue the value to locate
     * @return the index of the targetvalue or -1 if not foubnd
     */
    public int search(int[] theArray, int targetValue){
        int returnIndex = -1;
        if(theArray==null || theArray.length==0){
            // not found
            return returnIndex;
        }
        // find the middle
        int theMiddle = theArray.length/2;

        // test the value
        if(targetValue == theArray[theMiddle]){
            // all done
            return theMiddle;
        }
        if(theArray.length==1 && targetValue != theArray[theMiddle]){
            // all done
            return -1;
        }


        if(targetValue>theArray[theMiddle]){
            theArray= this.splitArrayInHalf(theArray,theMiddle,theArray.length);
        }else if(targetValue<theArray[theMiddle]){
            theArray= this.splitArrayInHalf(theArray,0,theMiddle);
        }

        return search(theArray,targetValue);
    }

    public int[] splitArrayInHalf(int[] theArray,int startIndex,int endIndex){
        if(theArray==null){
            return null;
        }

        if(startIndex>endIndex){
            throw new RuntimeException("startStart must be < endIndex");
        }
        int[] newArray = new int[endIndex-startIndex];

        int index =0;
        for(int counter=startIndex;counter<endIndex;counter++){
            newArray[index++]=theArray[counter];
        }
        return newArray;
    }

}
