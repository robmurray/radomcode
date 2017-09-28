package com.wmb.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/24/17.
 */
public class MissingIntTest {
    @Test
    public void basicTest(){
        int[] target = {1,2,3,5};
        MissingInt m = new MissingInt();
        int missingInt = m.solution(target);
        assertTrue(missingInt==4);
    }
    @Test
    public void basicTest2(){
        int[] target = {1,2,3,4,5,6,7,8,9,10,11,12,14,15};
        MissingInt m = new MissingInt();
        int missingInt = m.solution(target);
        assertTrue(missingInt==13);
    }
}
