package com.wmb.practice;



/**
 *
 * A palindrome is a word that reads the same backward or forward.
 * Write a function that checks if a given word is a palindrome. Character case should be ignored.
 *
 * For example, isPalindrome("Deleveled") should return true as character case should be ignored,
 * resulting in "deleveled", which is a palindrome since it reads the same backward and forward.
 *
 *
 *
 *
 * Created by robertmurray on 8/22/17.
 */
public class Palidrome {
    boolean isPalidrome(String target){
        if(target == null || target.trim().equals("")){
            return false;
        }

        char[] wrkTargetChar = target.trim().toLowerCase().toCharArray();
        int length = wrkTargetChar.length;
        char[] reversed = new char[length];
        for(int index =0;index<length;index++){
            reversed[length-1-index]=wrkTargetChar[index];
        }
        if(target.trim().equals(new String(reversed))){
            return true;
        }


        return false;
    }



    boolean isPalidrome5(String target){
        if(target ==null || target.trim().length()<1){
            throw new RuntimeException("target string must not be empty or null");
        }

        char[]forward = target.toLowerCase().toCharArray();
        char[] reveresed = new char[forward.length];
        for(int index =0;index<forward.length;index++){
            reveresed[index] = forward[forward.length-index-1];
        }
        String reversedString =new String(reveresed).toLowerCase();
        return reversedString.equals(target);
    }

    boolean isPalidrome2(String target){
        if(target ==null || target.trim().length()<1){
            throw new RuntimeException("target string must not be empty or null");
        }


        char[]forward = target.toLowerCase().toCharArray();
        char[] reveresed = new char[forward.length];



        for(int index =0;index<forward.length;index++){
            reveresed[index] = forward[forward.length-index-1];
        }
        String reversedString =new String(reveresed);
        return reversedString.equals(target);
    }
}
