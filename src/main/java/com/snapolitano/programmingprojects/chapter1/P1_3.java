package com.snapolitano.programmingprojects.chapter1;

public class P1_3 {

    public static final double ERROR = 0.000001;

    public static double piComputing() {
        double oldValue = 0;
        double newValue = 4;
        double denominator = 1;
        for (int i = 1; Math.abs(oldValue - newValue) > ERROR; i++) {
            denominator += 2;
            oldValue = newValue;
            if (i % 2 == 0) {
                newValue += 4 / denominator;
            } else {
                newValue -= 4 / denominator;
            }
        }
        return newValue;
    }
}
