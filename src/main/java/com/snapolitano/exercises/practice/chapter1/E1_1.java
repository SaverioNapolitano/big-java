package com.snapolitano.exercises.practice.chapter1;

/**
 * Prints greetings in different languages
 */
public class E1_1 {
    /**
     * @param language language of the greetings
     */
    public static void Greetings(String language) {
        switch (language) {
            case "En" -> System.out.println("Hello");
            case "It" -> System.out.println("Ciao");
            case "Es" -> System.out.println("Hola");
            case "Fr" -> System.out.println("Bonjour");
            case "De" -> System.out.println("Auf Wiedersehen");
        }
    }

    public static void main(String[] args) {
        Greetings("En");
        Greetings("It");
        Greetings("Es");
        Greetings("Fr");
        Greetings("De");
    }
}
