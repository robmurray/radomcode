package com.wmb.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInput {

    public static class TextInput {
        private List<Character> input = new ArrayList();
        //- adds the given character to the current value
        public void add(char c) {
            input.add(c);
        }
        //- returns the current value
        public String getValue(){
            String results = "";
            for(char current: input){
                results +=current;
            }
            return results;
        }

    }

    public static class NumericInput extends TextInput {
        private char[] numbers ={'0','1','2','3','4','5','6','7','8','9'};
        @Override
        public void add(char c) {
            if(isNumber(c)) {
                super.add(c);
            }
        }
        private boolean isNumber(char c){
            boolean result = false;
            for(int index =0;index<numbers.length;index++){
                if(c == numbers[index]){
                    result=true;
                    break;
                }
            }
            return result;
        }
    }

}