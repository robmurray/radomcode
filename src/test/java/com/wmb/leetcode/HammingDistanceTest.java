package com.wmb.leetcode;

import org.junit.Test;

/**
 * Created by robertmurray on 8/15/17.
 */
public class HammingDistanceTest {
    @Test
    public void basicTest(){
        HammingDistance hd = new HammingDistance();
        hd.hammingDistance(1,1);
        hd.hammingDistance(1,2);
        hd.hammingDistance(1,3);
        hd.hammingDistance(1,4);
        hd.hammingDistance(2,1);
        hd.hammingDistance(2,2);
        hd.hammingDistance(2,3);
        hd.hammingDistance(2,4);
        hd.hammingDistance(3,1);
        hd.hammingDistance(3,2);
        hd.hammingDistance(3,3);
        hd.hammingDistance(3,4);
        hd.hammingDistance(4,1);
        hd.hammingDistance(4,2);
        hd.hammingDistance(4,3);
        hd.hammingDistance(4,4);
    }
}
