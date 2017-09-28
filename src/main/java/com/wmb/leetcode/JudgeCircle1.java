package com.wmb.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by robertmurray on 8/15/17.
 */
public class JudgeCircle1 {

    private Integer currentX = 0;
    private Integer currentY = 0;

    public boolean judgeCircle(String moves) {
        if (moves == null || moves.trim().equals("") || moves.length()%2!=0) {
            return false;
        }
        char[] theMoves = moves.toCharArray();
        char currentMove = 'X';
        for (int count = 0; count < theMoves.length; count++) {
            currentMove = theMoves[count];
            switch (currentMove) {
                case 'L':
                    currentX -= 1;
                    break;
                case 'R':
                    currentX += 1;
                    break;
                case 'D':
                    currentY -= 1;
                    break;
                case 'U':
                    currentY += 1;
                    break;
                default: // do nothing
            }
        }
        return currentX==0 && currentY==0;
    }

}
