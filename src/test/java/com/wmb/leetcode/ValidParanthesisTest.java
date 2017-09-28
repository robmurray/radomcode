package com.wmb.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 3/29/17.
 */
public class ValidParanthesisTest {

    @Test
    public void testUneven(){
        String value="{[}";
        ValidParanthesis v = new ValidParanthesis();
        assertFalse(v.isValid(value));
    }
    @Test
    public void testEven(){
        String value="{[]}";
        ValidParanthesis v = new ValidParanthesis();
        assertTrue(v.isValid(value));
    }
    @Test
    public void testValid1(){
        String value="{[{}[]()]}";
        ValidParanthesis v = new ValidParanthesis();
        assertTrue(v.isValid(value));
    }
    @Test
    public void testValid2(){
        String value="{[{}[((())){{{}}}[][][]]()]}";
        ValidParanthesis v = new ValidParanthesis();
        assertTrue(v.isValid(value));
    }
    @Test
    public void testValid3(){
        String value="{[{}[((())){}}}[][][]]()]}";
        ValidParanthesis v = new ValidParanthesis();
        assertFalse(v.isValid(value));
    }
    @Test
    public void testValid4(){
        String value="]]{[{}[((())){}}}[][][]]()]}";
        ValidParanthesis v = new ValidParanthesis();
        assertFalse(v.isValid(value));
    }
    @Test
    public void testValid5(){
        String value="((";
        ValidParanthesis v = new ValidParanthesis();
        assertFalse(v.isValid(value));
    }


}
