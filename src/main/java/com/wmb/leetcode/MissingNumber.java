package com.wmb.leetcode;

import java.awt.*;

/**
 * Created by robertmurray on 8/15/17.
 */
public class MissingNumber {

    public int missingNumber1(int[] nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        System.out.println(sum);
        int results =(nums.length * (nums.length + 1) )/ 2 - sum;
        System.out.println(results);
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }


    public int missingNumber (int[] nums) {
        int n = nums.length;
        int i;
        int x1 = nums[0];
        int x2 = 1;

        /* For xor of all the elements
           in array */
        for (i = 1; i< n; i++) {
            x1 = x1 ^ nums[i];
        }

        /* For xor of all the elements
           from 1 to n+1 */
        for ( i = 2; i <= n+1; i++)
            x2 = x2^i;

        return (x1^x2);
    }

}
