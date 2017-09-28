package com.wmb.leetcode;


/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * <p>
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * <p>
 * <p>
 * <p>
 * Created by robertmurray on 3/19/17.
 */
public class ReverseIntegers {

    /*
        - Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4
        - Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50
        - Dividing an integer by 10 will remove the rightmost digit. (75 / 10) = 7
    */
    public int reverse(int x) {

        if(x<10 && x>-10){
            // nothing to do here
            return x;
        }
        int rightDigit = 0;
        int trunctateRight = x;
        long reversed = 0;

        while(trunctateRight!=0){
            rightDigit = trunctateRight%10;
            reversed = reversed*10+rightDigit;
            trunctateRight = trunctateRight/10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            reversed = 0;
        }
        return (int)reversed;
    }


    public int reverse0(int x) {
        int solution = 0;

        if (x < 10 && x > -10) {
            return x;
        }
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x = x * -1;
        }
        String temp = Integer.toString(x);
        char[] result = temp.toCharArray();
        char[] reverse = new char[temp.length()];
        int revereseCounter = 0;
        for (int count = temp.length() - 1; count > -1; count--) {
            reverse[revereseCounter++] = result[count];
        }


        try {
            solution = Integer.parseInt(new String(reverse));
        } catch (Exception e) {
            solution = 0;
        }

        return isNegative ? solution * -1 : solution;
    }

    /*
    - Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4
    - Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50
    - Dividing an integer by 10 will remove the rightmost digit. (75 / 10) = 7
    */
    public int reverse4(int x) {
        // if single digit just return x
        if (x < 10 && x > -1) {
            return x;
        }
        long wrkX = (long) x;
        long reversed = 0;

        while (wrkX != 0) {
            reversed = reversed * 10 + wrkX % 10;
            wrkX = wrkX / 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            reversed = 0;
        }
        return (int) reversed;
    }

    public int reverseInt(int input) {
        long reversedNum = 0;

        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return (int) reversedNum;
    }

}
