package com.wmb.leetcode;

import java.util.*;

/**
 * Created by robertmurray on 3/29/17.
 */
public class ValidParanthesis {

    private static final Map<Character, Character> LOOKUPMAP;

    static {
        Map<Character, Character> tempMAP = new HashMap<>();
        tempMAP.put(')', '(');
        tempMAP.put('}', '{');
        tempMAP.put(']', '[');
        LOOKUPMAP = Collections.unmodifiableMap(tempMAP);
    }

    private static String OPEN_CHARS = "({[";
    private static String CLOSE_CHARS = ")]}";

    public boolean isValid1(String s) {
        Stack<Character> history = new Stack<>();
        boolean valid = true;
        if (s == null) {
            return true;
        }
        if (s.length() % 2 != 0 || CLOSE_CHARS.indexOf(s.charAt(0)) > -1) {
            return false;
        }
        char wrkChar;
        for (int index = 0; index < s.length(); index++) {
            wrkChar = s.charAt(index);
            if (OPEN_CHARS.indexOf(wrkChar) > -1) {
                history.add(wrkChar);
            } else {
                char previousChar = history.pop();
                if (previousChar != LOOKUPMAP.get(wrkChar)) {
                    valid = false;
                    break;
                }
            }
        }
        if (history.size() > 0) {
            return false;
        }
        return valid;
    }

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

     The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


     * @param s
     * @return
     */
    public boolean isValid(String s) {
        boolean valid = false;
        if(s == null || s.trim().equals("")){
            return true;
        }
        char[] chars = s.toCharArray();

        char[][] brackets ={
                 {'(', ')'}
                ,{'{', '}'}
                ,{'[', ']'}
        };

        Stack<Character> stack = new Stack<>();




        return valid;
    }
}
