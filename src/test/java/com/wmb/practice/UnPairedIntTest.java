package com.wmb.practice;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 8/23/17.
 */
public class UnPairedIntTest {

    @Test
    public void testSimple(){
        int[] array = {1,2,3,4,5,1,2,4,5};
        NotPaireInt npi = new NotPaireInt();

        int result = npi.solution(array);
        assertTrue(result==3);

    }

    @Test
    public void testSimple2() {
        int[] array = {9, 3, 9, 3, 9, 7, 9};
        NotPaireInt npi = new NotPaireInt();

        int result = npi.solution(array);
        assertTrue(result == 7);
    }

}
