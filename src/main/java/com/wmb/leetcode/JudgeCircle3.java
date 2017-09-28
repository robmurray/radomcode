package com.wmb.leetcode;

import java.util.stream.IntStream;

/**
 * Created by robertmurray on 8/15/17.
 */
public class JudgeCircle3 {

    private int currentX = 0;
    private int currentY = 0;

    public boolean judgeCircle(String moves) {
        if (moves == null || moves.trim().equals("") || moves.length() < 1) {
            return false;
        }
        IntStream stream = moves.codePoints();
        stream.forEach(x -> {
            switch (x) {
                case 76:
                    currentX -= 1;
                    break;
                case 82:
                    currentX += 1;
                    break;
                case 68:
                    currentY -= 1;
                    break;
                case 85:
                    currentY += 1;
                    break;
            }
        });

        return currentX == 0 && currentY == 0;
    }


}
