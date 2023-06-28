// Created By Aman Tyagi Data: June 28, 2023

import java.util.Scanner;

class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getValidIntegerInput(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                int value = Integer.parseInt(input);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public int getIntegerInputInRange(String prompt, int min, int max) {
        while (true) {
            int value = getValidIntegerInput(prompt);
            if (value >= min && value <= max) {
                return value;
            } else {
                System.out.println("Invalid input. Please enter a value within the specified range.");
            }
        }
    }
}

class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        return (float) a / b;
    }
}

public class Basic_Calculator {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        Calculator calculator = new Calculator();

        int a = inputHandler.getValidIntegerInput("Enter the value of the first number:");
        int b = inputHandler.getValidIntegerInput("Enter the value of the second number:");

        int choice = 0;
        do {
            System.out.println("Enter which operation you want to perform:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("0. Exit");

            choice = inputHandler.getIntegerInputInRange("Enter your choice:", 0, 4);

            switch (choice) {
                case 1:
                    System.out.println("Addition = " + calculator.addition(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction = " + calculator.subtraction(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication = " + calculator.multiplication(a, b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Can't divide by zero.");
                    } else {
                        System.out.println("Division = " + calculator.division(a, b));
                    }
                    break;
                case 0:
                    System.out.println("Exiting the calculator...");
                    break;
            }
        } while (choice != 0);
    }
}