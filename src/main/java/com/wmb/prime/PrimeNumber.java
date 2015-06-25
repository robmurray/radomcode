package com.wmb.prime;

/**
 * prime numbers are natural numbers, which are not divisible by any positive number other than 1 and themselves.
 *
 * Created by rob on 6/25/15.
 */
public class PrimeNumber {

    /**
     * not very efficient
     * @param number the integer to test
     * @return true if prime,false otehrwise
     */
    public boolean isPrimeimpl1(int number){
        boolean isprime = true;


        for(int divsorCounter = 2;divsorCounter<number;divsorCounter++){

            if(number%divsorCounter==0){
                isprime=false;
            }
        }

        return isprime;

    }
    /**
     * more efficient
     * @param number the integer to test
     * @return true if prime,false otehrwise
     */
    public boolean isPrimeimpl2(int number){

        if(number <2){
            return false;
        }
        if(number == 2 || number ==3 ){
            return true;
        }
        // if even and not 2 it's prime
        if(number%2==0){
            return false;
        }

        for(int divsorCounter = 3;divsorCounter<number;divsorCounter+=2){

            if(number%divsorCounter==0){
                return false;
            }
        }

        return true;

    }

    /**
     * more efficient. interate to squareroot only
     * n = a*b and a <= b then a*a <= a*b = n.
     * @param number the integer to test
     * @return true if prime,false otehrwise
     */
    public boolean isPrimeimpl3(int number){

        if(number <2){
            return false;
        }
        if(number == 2 || number ==3 ){
            return true;
        }
        // if even and not 2 it's prime
        if(number%2==0){
            return false;
        }
        int sqrt = (int)Math.sqrt(number);

        for(int divsorCounter = 3;divsorCounter<sqrt;divsorCounter+=2){

            if(number%divsorCounter==0){
                return false;
            }
        }

        return true;

    }
}
