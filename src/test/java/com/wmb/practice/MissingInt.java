package com.wmb.practice;

import java.math.BigDecimal;

/**
 * Created by robertmurray on 8/24/17.
 */
public class MissingInt {

    public int solution(int[] A) {

        // n(n+1)/n
        if(A == null  || A.length==0){
            return 1;
        }

        int n = A.length+1;
        long total = (n*(n+1))/2;
//Math.pow()
        for(int index=0;index<A.length;index++){
            total-=A[index];
        }
        return (int)total;
    }
}
