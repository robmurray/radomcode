package com.wmb.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 3/31/17.
 */
public class SquareRootTest {
    @Test
    public void zeroTest(){
        baseTest(0,0);
    }
    @Test
    public void sqTest1(){
        baseTest(4,2);
    }
    @Test
    public void sqTest2(){
        baseTest(44444,210);
    }
    @Test
    public void sqLargestTest(){
        baseTest(Integer.MAX_VALUE,46340);
    }
    private void baseTest(int value,int expectedResults){
        SquareRoot s= new SquareRoot();
        assertTrue(s.mySqrt(value)==expectedResults);
    }
}
