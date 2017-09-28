package com.wmb.practice;

/**
 * Created by robertmurray on 8/24/17.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        if(A == null || K<1 || A.length==0){
            return A;
        }
        int maxIndex = A.length;
        int[] rotated = new int[maxIndex];

        int next =0;
        int newIndex = 0;
        // normalize K
        while(K >=maxIndex){
            K=K-maxIndex;

        }
        for(int index = 0;index<maxIndex;index++){
            next = A[index];
            newIndex=index+K;
            if(newIndex>=maxIndex){
                newIndex =newIndex-maxIndex;
            }
            rotated[newIndex] = next;
        }

        return rotated;
    }
}
