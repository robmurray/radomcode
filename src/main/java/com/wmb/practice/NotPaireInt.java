package com.wmb.practice;

import java.util.*;

/**
 * Created by robertmurray on 8/23/17.
 */
public class NotPaireInt {

    public int solution(int[] A) {
        int result = 0;
        for(int index=0;index<A.length;index++){
            result ^= A[index];
        }
        return result;
    }

    public int solution1(int[] A) {
        List<Integer> history = new ArrayList<>();
        int currentIndex = -1;
        for (int index = 0; index < A.length; index++) {
            currentIndex = history.indexOf(A[index]);
            if (currentIndex < 0) {
                history.add(A[index]);
            } else {
                history.remove(currentIndex);
            }
        }

        return history.get(0);
    }

}
