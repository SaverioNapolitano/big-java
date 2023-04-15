package com.snapolitano.exercises.practice.chapter1;

/**
 * Prints the balance of the accounts after first, second and third year
 */
public class E1_4 {
    static final double INITIAL_BALANCE = 1000;
    static final double INTEREST_PER_YEAR = 0.05;

    /**
     * @param balance actual balance of the account
     *
     * @return the new balance of the account with compounded interest
     */
    public static double balanceAfterOneYear(double balance) {
        return balance + INTEREST_PER_YEAR * balance;
    }

    public static void main(String[] args) {
        double balance = balanceAfterOneYear(INITIAL_BALANCE);
        System.out.println("First year: " + balance);
        balance = balanceAfterOneYear(balance);
        System.out.println("Second year: " + balance);
        balance = balanceAfterOneYear(balance);
        System.out.println("Third year: " + balance);
    }
}
