package com.snapolitano.exercises.practice.chapter1;

/**
 * Prints the product of the integers going from 1 to LAST_POSITIVE_INTEGER
 */
public class E1_3 {

    public static final long LAST_POSITIVE_INTEGER = 10;

    /**
     * @param LAST_POSITIVE_INTEGER the last integer (starting from 1) to multiply
     */
    public static void printProduct(long LAST_POSITIVE_INTEGER) {
        long product = 1;
        for (long i = 2; i <= LAST_POSITIVE_INTEGER; i++) {
            product *= i;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        printProduct(LAST_POSITIVE_INTEGER);
    }
}
