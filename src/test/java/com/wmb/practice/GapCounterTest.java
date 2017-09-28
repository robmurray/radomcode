package com.wmb.practice;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/23/17.
 */
public class GapCounterTest {
    @Test
    public void zeroGapTest(){
        int target = 7;
        BinaryGap bg= new BinaryGap();
        String binary = Integer.toBinaryString(target);
        int gap = bg.solution(target);
        assertTrue(gap==0);
    }

    @Test
    public void aGapTest(){
        int target = 17;
        BinaryGap bg= new BinaryGap();
        String binary = Integer.toBinaryString(target);
        int gap = bg.solution(target);
        assertTrue(gap==3);
    }
    @Test
    public void largeIntGapTest(){
        int target = Integer.MAX_VALUE;
        BinaryGap bg= new BinaryGap();
        String binary = Integer.toBinaryString(target);
        int gap = bg.solution(target);
        assertTrue(gap==0);
    }

    @Test
    public void smallestIntGapTest(){
        int target = 1;
        BinaryGap bg= new BinaryGap();
        String binary = Integer.toBinaryString(target);
        int gap = bg.solution(target);
        assertTrue(gap==0);
    }
}
