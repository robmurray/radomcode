package com.wmb.leetcode;

/**
 * Created by robertmurray on 8/15/17.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int xor = x^y;

        String binaryXOR =Integer.toBinaryString(xor);
        String results =binaryXOR.replaceAll("0","");
        return results.length();

    }

    public int hammingDistance1(int x, int y) {
        int xor = x^y;
        String binaryXOR =Integer.toBinaryString(xor);
        return (int) binaryXOR.chars().filter(ch -> ch =='1').count();

    }
}
