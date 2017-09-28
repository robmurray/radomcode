package com.wmb.practice;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


/**
 * Created by robertmurray on 8/23/17.
 */
public class FibonacciTest {
    @Test
    public void gen0Test(){
        Fibonacci f = new Fibonacci();
        int[] results = f.generate(0);
        assertNull(results);
    }
    @Test
    public void gen1Test(){
        Fibonacci f = new Fibonacci();
        int[] results = f.generate(1);
        assertTrue(results.length==1);
    }
    @Test
    public void gen2Test(){
        Fibonacci f = new Fibonacci();
        int[] results = f.generate(2);
        assertTrue(results.length==2);
    }

    @Test
    public void gen5Test(){
        Fibonacci f = new Fibonacci();
        int[] results = f.generate(5);
        assertTrue(results.length==5);
    }
    @Test
    public void gen5TrueTest(){
        Fibonacci f = new Fibonacci();
        int[] results = f.generate(5);
        assertTrue(f.isFibonacci(results));

    }
    @Test
    public void gen5FalseTest(){
        Fibonacci f = new Fibonacci();
        int[] arrayInt = {0,1,1,2,3,7,10};
        assertFalse(f.isFibonacci(arrayInt));

    }
}
