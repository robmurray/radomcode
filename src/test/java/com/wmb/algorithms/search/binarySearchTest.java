package com.wmb.algorithms.search;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by rob on 6/16/15.
 */
public class BinarySearchTest {

    private Integer[] sortedArray1 ={1,2,3,4,5,6,7,8,9,10};
    private int[] sortedArray2 ={1,2,3,4,5,6,7,8,9,10};

    @Test
    public void binarySearchFailTest(){
        Integer targetValue = 12;
        Integer valueReturned =null;


        BinarySearch2 bs = new BinarySearch2();
        valueReturned = bs.search(sortedArray1,targetValue);

        assertEquals(valueReturned,null);


    }

    @Test
    public void binarySearchPassTest(){
        Integer targetValue = 3;
        Integer valueReturned =null;


        BinarySearch2 bs = new BinarySearch2();
        valueReturned = bs.search(sortedArray1,targetValue);
        assertEquals(targetValue,valueReturned);
        //assertTrue("solution found",false);


    }

    @Test
    public void binarySearchv2FailTest(){
        int targetValue = 12;
        int valueReturned =-1;


        BinarySearch bs = new BinarySearch();
        valueReturned = bs.search(sortedArray2,targetValue);

        assertEquals(valueReturned,-1);


    }

    @Test
    public void binarySearchv2PassTest(){
        int targetValue = 3;
        int valueReturned =-1;


        BinarySearch bs = new BinarySearch();
        valueReturned = bs.search(sortedArray2,targetValue);
        assertEquals(targetValue,sortedArray2[valueReturned]);
        //assertTrue("solution found",false);


    }
}
