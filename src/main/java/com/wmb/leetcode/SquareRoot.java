package com.wmb.leetcode;

/**
 * Created by robertmurray on 3/30/17.
 */
public class SquareRoot {

    /*
1. Estimate - first, get as close as you can by finding two perfect square roots your number is between.

2. Divide - divide your number by one of those square roots.

3. Average - take the average of the result of step 2 and the root.

4. Use the result of step 3 to repeat steps 2 and 3 until you have a number that is accurate enough for you.


f(x)=x^{2}-S=0\,\!
     */
    public int mySqrt(int value) {
        int squareRoot = 0;
        int leftShiftedBit = 1 << 30;

        while (leftShiftedBit > value)
            leftShiftedBit >>= 2;

        while (leftShiftedBit != 0) {
            if (value >= squareRoot + leftShiftedBit) {
                value -= squareRoot + leftShiftedBit;
                squareRoot = (squareRoot >> 1) + leftShiftedBit;
            } else
                squareRoot >>= 1;
            leftShiftedBit >>= 2;
        }
        return squareRoot;
    }
}
