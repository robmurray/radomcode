package com.wmb.leetcode;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 3/19/17.
 */
public class ReverseIntTest {
    @Test
    public void test1() {
        int target = 1;
        int expected = 1;
        baseTest(target, expected);
    }

    @Test
    public void test2() {
        int target = 12;
        int expected = 21;
        baseTest(target, expected);
    }

    @Test
    public void test3() {
        int target = -12;
        int expected = -21;
        baseTest(target, expected);
    }

    @Test
    public void test4() {
        int target = -12345;
        int expected = -54321;
        baseTest(target, expected);
    }

    @Test
    public void largeIntTest() {
        int target = Integer.MAX_VALUE;
        //int expected = 7463847412;
        int expected =0;
        baseTest(target, expected);

    }

    @Test
    public void smallIntTest() {
        int target = Integer.MIN_VALUE;
        int expected = 0;
        baseTest(target, expected);

    }
    public void baseTest(int target, int expected) {
        ReverseIntegers ri = new ReverseIntegers();
        int actual = ri.reverse(target);
        System.out.println(target + " " + expected + " " + actual);
        assertTrue(actual == expected);
    }
}
