package com.wmb.practice;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/24/17.
 */
public class CyclicRotationTest {

    @Test
    public void basicTest1(){

        int[] target = {3, 8, 9, 7, 6 };
        int[] expected = {9,7,6,3, 8 };
        int rotations = 3;
        CyclicRotation c= new CyclicRotation();
        int [] results =c.solution(target,3);
        assertTrue(results[0]==expected[0]);
    }

    @Test
    public void kGreaterThanMaxTest(){

        int[] target = {3, 8, 9, 7, 6 };
        int[] expected = {3, 8, 9, 7, 6 };
        int rotations = 10;
        CyclicRotation c= new CyclicRotation();
        int [] results =c.solution(target,rotations);
        assertTrue(results[0]==expected[0]);
    }

    @Test
    public void kGreaterThanMaxTest2(){

        int[] target = {3, 8, 9, 7, 6 };
        int[] expected = {6,3, 8, 9, 7};
        int rotations = 11;
        CyclicRotation c= new CyclicRotation();
        int [] results =c.solution(target,rotations);
        assertTrue(results[0]==expected[0]);
    }
    @Test
    public void basicTest2(){

        int[] target = {1000};
        int[] expected = {1000};
        int rotations = 5;
        CyclicRotation c= new CyclicRotation();
        int [] results =c.solution(target,rotations);
        assertTrue(results[0]==expected[0]);
    }

}
