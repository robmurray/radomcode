package com.wmb.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by rob on 3/9/15.
 */
public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] array = {1, 10, 5, 7, 3, 6, 4, 2, 8, 9, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = null;
        InsertionSort is = new InsertionSort();

        result = is.sort(array);

        assertTrue(Arrays.equals(expected, result));
    }


}
