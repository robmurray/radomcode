package com.wmb.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/15/17.
 */
public class JudgeCircleTest {

    @Test
    public void noMoveTest(){
        JudgeCircle1 jc = new JudgeCircle1();
        String moves =null;
        assertFalse(jc.judgeCircle(moves));
        moves ="    ";
        assertFalse(jc.judgeCircle(moves));
    }

    @Test
    public void notCircleOneMove(){
        JudgeCircle1 jc = new JudgeCircle1();
        String moves ="U";
        assertFalse(jc.judgeCircle(moves));
    }
    @Test
    public void notCircleTwoMove(){
        JudgeCircle1 jc = new JudgeCircle1();
        String moves ="UU";
        assertFalse(jc.judgeCircle(moves));
    }
    @Test
    public void circleTwoMove(){
        JudgeCircle1 jc = new JudgeCircle1();
        String moves ="UD";
        assertTrue(jc.judgeCircle(moves));
    }
    @Test
    public void circleManyMoves(){
        JudgeCircle1 jc = new JudgeCircle1();
        String moves ="UURRDDLL";
        assertTrue(jc.judgeCircle(moves));
    }
    @Test
    public void notCircleManyMoves(){
        JudgeCircle1 jc = new JudgeCircle1();
        String moves ="UURRDDLLL";
        assertFalse(jc.judgeCircle(moves));
    }
}
