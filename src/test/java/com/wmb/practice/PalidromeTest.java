package com.wmb.practice;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/22/17.
 */
public class PalidromeTest {
    @Test
    public void testBasicPalidrome(){
        Palidrome p = new Palidrome();
        String testString="bob";
        assertTrue(p.isPalidrome(testString));

    }
    @Test
    public void testnotPalidrome(){
        Palidrome p = new Palidrome();
        String testString="boberreno";
        assertFalse(p.isPalidrome(testString));

    }
    @Test
    public void testIsPalidrome(){
        Palidrome p = new Palidrome();
        String testString="Deleveled";
        assertTrue(p.isPalidrome(testString));

    }
}
