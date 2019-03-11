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
}
