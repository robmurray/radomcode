package com.wmb.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 3/19/17.
 */
public class AtoITest {
    @Test
    public void test1() {
        String input = "   0";
        int expect = 0;
        baseTest(input,expect);
    }

    @Test
    public void emptyString() {
        String input = "";
        int expect = 0;
        baseTest(input,expect);
    }

    @Test
    public void leadingZeroTest() {
        String input = "01111a";
        int expect = 1111;
        baseTest(input,expect);
    }

    @Test
    public void negatvieNumberTest() {
        String input = "-01111a";
        int expect = -1111;
        baseTest(input,expect);
    }
    @Test
    public void largeIntTest() {
        String input = Integer.toString(Integer.MAX_VALUE);
        int expect = Integer.MAX_VALUE;
        baseTest(input,expect);
    }
    @Test
    public void largeIntTest2() {
        String input = "2147483648";
        int expect = Integer.MAX_VALUE;
        baseTest(input,expect);
    }
    @Test
    public void largeIntTest3() {
        String input = "9223372036854775809";
        int expect = Integer.MAX_VALUE;
        baseTest(input,expect);
    }


    public void baseTest(String input, int expected){
        AtoI atoI = new AtoI();
        int actual = atoI.myAtoi(input);
        assertTrue(actual==expected);
    }

}
