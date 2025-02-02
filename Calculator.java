package com.studyopedia;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operation (a for addition, s for subtraction, m for multiplication, d for division, u for modulus): ");
        char operation = scanner.next().charAt(0);
        int result = 0;
        boolean validOperation = true;
        switch (operation) {
            case 'a':
                result = num1 + num2;
                System.out.println(num1 + "a" + num2 + " = " + result);
                break;
            case 's':
                result = num1 - num2;
                System.out.println(num1 + "s" + num2 + " = " + result);
                break;
            case 'm':
                result = num1 * num2;
                System.out.println(num1 + "m" + num2 + " = " + result);
                break;
            case 'd':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + "d" + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 'u':
                result = num1 % num2;
                System.out.println(num1 + "u" + num2 + " = " + result);
                break;
            default:
                validOperation = false;
                System.out.println("Invalid operation. Please use 'a', 's', 'm', 'd', or 'u'.");
        }
        scanner.close();
    }
}

