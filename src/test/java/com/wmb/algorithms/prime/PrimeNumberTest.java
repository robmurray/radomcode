package com.wmb.algorithms.prime;

import com.wmb.prime.PrimeNumber;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by rob on 6/16/15.
 */
public class PrimeNumberTest {


    public static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
    public static int[] noteprimes = {4,6,8,10};
    @Test
    public void isPrime11Test() {
        boolean targetValue = true;
        boolean valueReturned = false;
        int testValue = 11;

        PrimeNumber pn = new PrimeNumber();

        valueReturned = pn.isPrimeimpl1(testValue);

        assertEquals(valueReturned, targetValue);


    }
    @Test
    public void isPrimeTest() {
        boolean targetValue = true;
        boolean valueReturned = false;


        PrimeNumber pn = new PrimeNumber();
        for(int index = 0;index<primes.length;index++) {
            valueReturned = pn.isPrimeimpl1(primes[index]);
            assertEquals(valueReturned, targetValue);
        }


    }
    @Test
    public void isNotPrimeTest() {
        boolean targetValue = false;
        boolean valueReturned = false;


        PrimeNumber pn = new PrimeNumber();
        for(int index = 0;index<noteprimes.length;index++) {
            valueReturned = pn.isPrimeimpl1(noteprimes[index]);
            assertEquals(valueReturned, targetValue);
        }


    }


    @Test
    public void isPrime2_11Test() {
        boolean targetValue = true;
        boolean valueReturned = false;
        int testValue = 11;

        PrimeNumber pn = new PrimeNumber();

        valueReturned = pn.isPrimeimpl2(testValue);

        assertEquals(valueReturned, targetValue);


    }
    @Test
    public void isPrime2Test() {
        boolean targetValue = true;
        boolean valueReturned = false;


        PrimeNumber pn = new PrimeNumber();
        for(int index = 0;index<primes.length;index++) {
            valueReturned = pn.isPrimeimpl2(primes[index]);
            assertEquals(valueReturned, targetValue);
        }


    }
    @Test
    public void isNotPrime2Test() {
        boolean targetValue = false;
        boolean valueReturned = false;


        PrimeNumber pn = new PrimeNumber();
        for(int index = 0;index<noteprimes.length;index++) {
            valueReturned = pn.isPrimeimpl2(noteprimes[index]);
            assertEquals(valueReturned, targetValue);
        }


    }


    @Test
    public void isPrime3_11Test() {
        boolean targetValue = true;
        boolean valueReturned = false;
        int testValue = 11;

        PrimeNumber pn = new PrimeNumber();

        valueReturned = pn.isPrimeimpl3(testValue);

        assertEquals(valueReturned, targetValue);


    }
    @Test
    public void isPrime3Test() {
        boolean targetValue = true;
        boolean valueReturned = false;


        PrimeNumber pn = new PrimeNumber();
        for(int index = 0;index<primes.length;index++) {
            valueReturned = pn.isPrimeimpl3(primes[index]);
            assertEquals(valueReturned, targetValue);
        }


    }
    @Test
    public void isNotPrime3Test() {
        boolean targetValue = false;
        boolean valueReturned = false;


        PrimeNumber pn = new PrimeNumber();
        for(int index = 0;index<noteprimes.length;index++) {
            valueReturned = pn.isPrimeimpl3(noteprimes[index]);
            assertEquals(valueReturned, targetValue);
        }


    }
    @Test
    public void printPrimeTest(){

        PrimeNumber pn = new PrimeNumber();
        pn.printPrime();
        assertTrue(true);
    }

}
