package com.wmb.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by robertmurray on 4/3/17.
 */
public class MergeTwoSortedListtest {

    @Test
    public void testNullN1Merge(){
        MergeTwoSortedList.ListNode node1 = null;
        MergeTwoSortedList.ListNode node2 = new MergeTwoSortedList.ListNode(2);
        MergeTwoSortedList.ListNode result = null;
        MergeTwoSortedList.ListNode expect = null;
        MergeTwoSortedList ml = new MergeTwoSortedList();
        result=ml.mergeTwoLists(node1,node2);
        assertEquals(result,node2);
    }
    @Test
    public void testNullN2Merge(){
        MergeTwoSortedList.ListNode node1 = new MergeTwoSortedList.ListNode(2);
        MergeTwoSortedList.ListNode node2 = null;
        MergeTwoSortedList.ListNode result = null;
        MergeTwoSortedList.ListNode expect = null;
        MergeTwoSortedList ml = new MergeTwoSortedList();
        result=ml.mergeTwoLists(node1,node2);
        assertEquals(result,node1);
    }

}
