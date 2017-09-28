package com.wmb.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/15/17.
 */
public class MissingNumberTest {

    @Test
    public void testZero(){
        int[] numbers = {0};
        testBase(numbers,1);
    }
    @Test
    public void testOne(){
        int[] numbers = {1};
        testBase(numbers,0);
    }
    @Test
    public void basicTest(){
        int[] numbers = {1,2,4};
        testBase(numbers,3);
    }

    @Test
    public void test2(){
        int[] numbers = {1,2,3,4,6,7,8};
        testBase(numbers,5);
    }

    public void testBase(int[] numbers, int expected){
        MissingNumber mn = new MissingNumber();
        int results = mn.missingNumber(numbers);
        assertTrue(results==expected);
    }
}
