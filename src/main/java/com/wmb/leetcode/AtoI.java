package com.wmb.leetcode;

/**
 * Created by robertmurray on 3/19/17.
 */
public class AtoI {

    public int myAtoi(String str) {

        int sign = 1;
        long result = 0;
        int finalResult = 0;
        // trim leading spaces
        str = str.replaceFirst("\\s*", "");
        if (str.length() < 1) {
            return 0;
        }

        // handle the sign if any
        char potentialSign = str.charAt(0);
        if (potentialSign == '+' || potentialSign == '-') {
            if (str.length() < 2) {
                return 0;
            }
            str = str.substring(1);
            if (potentialSign == '-') {
                sign = -1;
            }
        }
        // remove zero prefix
        str = str.replaceFirst("0*", "");
        if (str.length() < 1) {
            return 0;
        }
        if(str.matches("[A-z]"))
        if (result * sign > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result * sign < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }


        char wrkChar;
        try {
            for (int count = 0; count < str.length(); count++) {
                wrkChar = str.charAt(count);
                if (!Character.isDigit(wrkChar)) {
                    break;
                }
                result = result * 10 + wrkChar - '0';

                if (result * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            finalResult = (int) result * sign;
        } catch (NumberFormatException e) {
            return 0;
        }

        return finalResult;
    }


    public int myAtoi1(String str) {
        int solution = 0;
        // validation
        if (str == null) {
            return 0;
        }
        String wrkString = str.trim();
        if (wrkString.length() < 1) {
            return 0;
        }

        // leading zero check
        boolean leadingZeros = true;
        int index = -1;
        while (leadingZeros && index <= wrkString.length() - 1) {
            if (wrkString.charAt(++index) != '0') {
                leadingZeros = false;
            }
        }

        wrkString = wrkString.substring(index);


        try {
            solution = Integer.parseInt(wrkString);
        } catch (NumberFormatException e) {
            // log or something\
            // returning zero
            return 0;
        }
        return solution;
    }

}
