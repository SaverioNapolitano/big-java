package com.snapolitano.programmingprojects.chapter1;

public class P1_4 {

    static final double TIP_PERCENTAGE = 0.15;

    public static void moneyToPay(int numberOfFriends, double bill) {
        double tip = bill * TIP_PERCENTAGE;
        double totalCost = bill + tip;
        double amountPerPerson = totalCost / numberOfFriends;
        double tipPerPerson = tip / numberOfFriends;
        double billPerPerson = bill / numberOfFriends;
        System.out.println("The amount of the bill is " + bill);
        System.out.println("The amount of the tip is " + tip);
        System.out.println("The total cost is " + totalCost);
        System.out.println("The amount each person has to pay is " + amountPerPerson);
        System.out.println("For the bill each person has to pay " + billPerPerson);
        System.out.println("Fot the tip each person has to pay " + tipPerPerson);
    }

    public static void main(String[] args) {
        moneyToPay(3, 300);
        moneyToPay(5, 225);
        moneyToPay(1, 213);
    }
}
