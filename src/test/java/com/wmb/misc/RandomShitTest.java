package com.wmb.misc;

import org.junit.Test;

/**
 * Created by robertmurray on 8/17/17.
 */
public class RandomShitTest {
    @Test
    public void incrementTest1(){

        int a =1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

    }
    @Test
    public void useOfAndTest(){

        int value = 10;
        int newValue = 0;
        newValue = value &3;
        System.out.println(newValue);

    }
}
