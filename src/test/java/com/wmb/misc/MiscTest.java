package com.wmb.misc;

import org.junit.Test;

/**
 * Created by rob on 6/17/15.
 */
public class MiscTest {
    @Test
    public void bitshiftTest(){
        long id =1000000;

        int shifted =(int) (id ^ (id >>> 32));
        System.out.println(id);
        System.out.println(shifted);

        System.out.println(Integer.toBinaryString(2 << 10));
        System.out.println(Integer.toBinaryString(2 >> 10));
        System.out.println(2 << 22);

    }

    @Test
    public void equalsTest(){

    }
}
