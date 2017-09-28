package com.wmb.practice;

/**
 * Created by robertmurray on 8/23/17.
 */
public class Fibonacci {

    // F_{n}=F_{n-1}+F_{n-2},}
    public int[] generate(int iterations){
        if(iterations<1){
            return null;
        }
        int[] sequence = new int[iterations];
        sequence[0]=0;
        if(iterations<2){
            return sequence;
        }
        sequence[1]=1;

        for(int count =2;count< iterations;count++){
            sequence[count]=sequence[count-1]+sequence[count-2];
        }
        return sequence;
    }

    public boolean isFibonacci(int[] sequence){
        boolean results = true;
        // next = index-1+index-2
        if(sequence==null){
            return false;
        }
        // TODO verify
        if(sequence.length<1){
            return true;
        }
        for(int index =3;index<sequence.length;index++){
            if(sequence[index] !=sequence[index-1]+sequence[index-2]){
                results = false;
                break;
            }
        }

        return results;

    }


}
