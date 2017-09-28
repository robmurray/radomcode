package com.wmb.practice;

/**
 * Created by robertmurray on 8/23/17.
 */
public class BinaryGap {

    public int solution(int N) {
        char[] binary = Integer.toBinaryString(N).toCharArray();
        int currentLargestBinaryGap = 0;
        int gapCounter =0;
        for (int index = 0; index < binary.length; index++) {
            if(binary[index]=='0'){
                gapCounter+=1;
            }else{
                if(gapCounter>currentLargestBinaryGap){
                    currentLargestBinaryGap=gapCounter;
                }
                gapCounter=0;
            }
        }
        return currentLargestBinaryGap;
    }

}
