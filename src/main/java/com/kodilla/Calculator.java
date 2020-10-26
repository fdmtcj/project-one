package com.kodilla;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addition = calculator.addition(2, 5);
        System.out.println(addition);
        int substraction = calculator.substraction(9, 3);
        System.out.println(substraction);

    }
}





