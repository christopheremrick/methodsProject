package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        helloWorld();

        System.out.println("Type in a name");

        String inputName = scan.nextLine();

        System.out.println(helloName(inputName));

        System.out.println("Type two numbers to multiply");

        Integer firstNumber = scan.nextInt();
        Integer secondNumber = scan.nextInt();

        System.out.println(multiply(firstNumber, secondNumber));

        System.out.println("Type two numbers to divide");

        Double firstDouble = scan.nextDouble();
        Double secondDouble = scan.nextDouble();

        System.out.println(divide(firstDouble, secondDouble));

        System.out.println("Type two numbers to find the greater one");

        Double firstGreater = scan.nextDouble();
        Double secondGreater = scan.nextDouble();

        System.out.println(greaterNumber(firstGreater, secondGreater));

        System.out.println("Type two words to switch their order");
        scan.nextLine();
        String firstString = scan.nextLine();

        String secondString = scan.nextLine();

        System.out.println(switchOrder(firstString, secondString));


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
            returnValue = firstNumber;
        }
        return returnValue;

    }
    public static String switchOrder(String firstString, String secondString) {

        return secondString + " " + firstString;

    }
}
