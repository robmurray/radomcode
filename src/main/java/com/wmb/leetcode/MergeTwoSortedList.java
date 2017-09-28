package com.wmb.leetcode;

/**
 * Created by robertmurray on 4/3/17.
 */
public class MergeTwoSortedList {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = null;
        ListNode nextNode = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        nextNode = l1;
        while (nextNode != null) {

            if (l1.val <= l2.val) {

                //merged =
            }


            if (nextNode.val < l2.val) {
                merged = nextNode;
            } else {

            }


        }
//        if (l1.val > l2.val)
        //  while(l1)

        return merged;
    }

}
