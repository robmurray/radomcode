package com.wmb.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 * Created by robertmurray on 3/18/17.
 */
public class TwoSums {

    public int[] twoSum(int[] nums, int target) {
        int[] results= new int[2];
        for(int count =0; count<nums.length;count++){
            for(int count2 =count+1; count2<nums.length;count2++){
                if(nums[count]+nums[count2]==target && count!=count2){
                    results[0]=count;
                    results[1]=count2;
                    return results;
                }
            }
        }
        return null;
    }

    public int[] twoSum4(int[] nums, int target) {
        int a=0;
        int b=0;
        int[] results= new int[2];
        if(nums.length<2){
            throw new RuntimeException("nums must contain atleast two numbers");
        }
        for (int count = 0;count < nums.length;count++) {
            a = nums[count];
            for (int count2 = 1;count2 < nums.length;count2++) {
                if(count == count2){
                    continue;
                }
                b= nums[count2];
                if(a+b==target){
                    results[0]=count;
                    results[1]=count2;
                    return results;
                }
            }
        }
        return results;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
