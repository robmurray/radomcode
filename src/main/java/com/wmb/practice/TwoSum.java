package com.wmb.practice;

/**
 * Created by robertmurray on 8/23/17.
 */
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] results = new int[2];

        if(list == null || list.length<1){
            return null;
        }
        int wrkSum = 0;
        boolean foundResults = false;
        for(int index=0;index<list.length-1;index++){
            for(int index2=index+1;index2<list.length;index2++) {
                wrkSum =list[index]+list[index2];
                if(wrkSum==sum){
                    results[0]=index;
                    results[1]=index2;
                    foundResults=true;
                    break;
                }
            }
            if(foundResults){
                break;
            }
        }

        return foundResults?results:null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}