package com.wmb.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 3/27/17.
 */
public class PalidromeTest {

    @Test
    public void palidromeTest1(){
        Palidrome p = new Palidrome();
        assertTrue(p.isPalindrome(1));
    }
    @Test
    public void palidromeTest2(){
        Palidrome p = new Palidrome();
        assertFalse(p.isPalindrome(93245));
    }

    @Test
    public void palidromeTest3(){
        Palidrome p = new Palidrome();
        assertTrue(p.isPalindrome(93239));
    }
    @Test
    public void palidromeTest4(){
        Palidrome p = new Palidrome();
        assertFalse(p.isPalindrome(-2147483648));

    }
    @Test
    public void palidromeTest5(){
        Palidrome p = new Palidrome();
        assertFalse(p.isPalindrome(-2147447412));
    }


}
