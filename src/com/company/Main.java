package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mortgagePayment();
        System.out.println("=============================");
        excersizes();
        System.out.println("=============================");
    }

    private static void mortgagePayment() {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("Principal: " + age);

        double annualInterestRate = scanner.nextDouble();
        System.out.println("Annual interest rate: " + annualInterestRate);

        int periodInYears = scanner.nextInt();
        System.out.println("Period in years: " + periodInYears);

        // get the monthly interest rate as a percentage to multiply the Principal number with (thus divide it by 100)
        // get the monthly interest rate (divide the annualInterestRate by 12)



    }

    private static void excersizes(){
        // write your code here

        // String message = "C:\\Windows\\Users..";
        // System.out.println(message);

        int x = 10 + 3 * 2;
        System.out.println(x);

        // Implicit types (conversion);
        // automatic conversion happens if there is no possible chance of data loss (e.g. 1.1 -> 1.0)
        // byte > short > int > long > float > double

        /* Result is always zero because precedence;
        Math.random is converted from a double (number with decimals) to a int (number without decimals)
        If we wrap it around parenthesis (the highest order of precedence),
        this expression (expression always returns a value) will be executed first.
        The second expression (where the conversion to int happens) is executed second, thus returning a rounded number */
        int resultWhichIsAlwaysZero = (int) (Math.random() * 100);
        System.out.println(resultWhichIsAlwaysZero);

        NumberFormat.getCurrencyInstance();

        // Scanner with param System.in for reading data being entered into the system
        Scanner scanner = new Scanner(System.in);

        // The line below provides the user with a question to enter the age.
        // The use of 'print' makes it possible to have the user enter the value on the same line as where the question is asked.
        System.out.print("Please enter your age: ");
        // This line below is responsible for prompting the user to enter a value
        byte age = scanner.nextByte();
        System.out.println("Age: " + age);
    }
}
