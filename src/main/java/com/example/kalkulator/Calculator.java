package com.example.kalkulator;

import java.sql.SQLOutput;

public class Calculator {

    public int addingNumbers(int a, int b){
            return a + b;
    }

    public int substractionNumbers(int a, int b){
            return a - b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int addAToB = calculator.addingNumbers(4,5);
        int substractAToB = calculator.substractionNumbers(9, 5);

        System.out.println(addAToB);
        System.out.println(substractAToB);

    }
}
