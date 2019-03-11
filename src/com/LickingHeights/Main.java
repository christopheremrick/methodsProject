package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        helloWorld();

        String inputName = scan.nextLine();

        helloName(inputName);

        Integer firstNumber = scan.nextInt();
        Integer secondNumber = scan.nextInt();

        multiply(firstNumber, secondNumber);

        Double firstDouble = scan.nextDouble();
        Double secondDouble = scan.nextDouble();

        divide(firstDouble, secondDouble);

        Double firstGreater = scan.nextDouble();
        Double secondGreater = scan.nextDouble();

        greaterNumber(firstGreater, secondGreater);

        String firstString = scan.nextLine();
        String secondString = scan.nextLine();

        switchOrder(firstString, secondString);






    }

    public static void helloWorld() {

        System.out.println("Hello World!");

    }
    public static String helloName(String input) {

        return "Hello " + input;
    }
    public static Integer multiply(Integer firstNumber, Integer secondNumber) {


        return firstNumber * secondNumber;
    }
    public static Double divide(Double firstNumber, Double secondNumber) {

        return firstNumber / secondNumber;
    }
    public static Double greaterNumber(Double firstNumber, Double secondNumber) {

        Double returnValue = 0.0;

        if(firstNumber > secondNumber) {
            returnValue = firstNumber;
        }
        else if(firstNumber < secondNumber) {
            returnValue = secondNumber;
        }
        else {
            returnValue = 0.0;
        }
        return returnValue;

    }
    public static String switchOrder(String firstString, String secondString) {

        return secondString + firstString;

    }
}
