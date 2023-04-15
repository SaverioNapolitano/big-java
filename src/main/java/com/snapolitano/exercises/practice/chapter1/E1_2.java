package com.snapolitano.exercises.practice.chapter1;

/**
 * Prints the sum of the integers going from 1 to LAST_POSITIVE_INTEGER
 */
public class E1_2 {
    public static final int LAST_POSITIVE_INTEGER = 10;

    /**
     * @param LAST_POSITIVE_INTEGER the last integer (starting from 1) to sum
     */
    public static void printSum(int LAST_POSITIVE_INTEGER) {
        System.out.println(LAST_POSITIVE_INTEGER * (LAST_POSITIVE_INTEGER + 1) / 2);
    }

    public static void main(String[] args) {
        printSum(LAST_POSITIVE_INTEGER);
    }
}
