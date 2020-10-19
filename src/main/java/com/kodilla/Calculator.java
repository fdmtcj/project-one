package com.kodilla;

public class Calculator {

    public void addition(int a, int b) {
        int result= a+b ;

     System.out.println("Result= "+ result);

    }
    public void substraction(){
        System.out.println("result=0");

    }

    public static void main(String[]args){
        Calculator calculator= new Calculator();
        calculator.addition(2,5);
        calculator.addition(4,6);
    }


}


