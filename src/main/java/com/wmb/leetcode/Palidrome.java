package com.wmb.leetcode;

import java.math.BigDecimal;

/**
 * Created by robertmurray on 3/27/17.
 */
public class Palidrome {

    public boolean isPalindromefail(int x) {
        boolean isPalidrome = false;
        BigDecimal wrkX=new BigDecimal(x).abs();

        if(wrkX.pow(2).equals(wrkX.multiply(wrkX))){
            isPalidrome=true;
        }
        return isPalidrome;
    }

    public boolean isPalindrome2(int x) {
        String wrkString = Integer.toString(x);
        StringBuilder sb = new StringBuilder(wrkString.length());
        char[] contents = wrkString.toCharArray();
        // reverse
        for (int i = wrkString.length() - 1; i >= 0; i--) {
            sb.append(contents[i]);
        }

        return wrkString.equals(sb.toString());
    }

    public boolean isPalindrome0(int x) {
        String wrkX = Integer.toString(x);
        String reversed = reverse(wrkX);
        return wrkX.equals(reversed);
    }

    public boolean isPalindrome(int x) {

        int reversed = reverse(x);
        return x==reversed;
    }

    private int reverse(int x) {
        // if single digit just return x
        if(x<10&&x>-1){
            return x;
        }
        long wrkX = (long)x;
        long reversed=0;

        while(wrkX!=0){
            reversed = reversed*10+wrkX%10;
            wrkX = wrkX/10;
        }
        if (reversed> Integer.MAX_VALUE || reversed< Integer.MIN_VALUE) {
            reversed =0;
        }
        return (int)reversed;
    }


    private String reverse(String palidromeInt) {
        if (palidromeInt.length() <= 1) {
            return palidromeInt;
        }
        return reverse(palidromeInt.substring(1)) + palidromeInt.charAt(0);
    }

    /*public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverse(input);

        return input.equals(reversed);
    }

    public String reverse(String str) {
        if (str == null) {
            return null;
        }

        if (str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }


    public boolean checkPalindrome(String text) {

        StringBuilder sb = new StringBuilder(text);
        char[] contents = text.toCharArray();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(contents[i]);
        }

        String reversed = sb.toString();

        return text.equals(reversed);
    }
*/

}
