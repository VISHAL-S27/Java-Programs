package com.studyopedia;
import java.util.Scanner;
public class CompareFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second float number: ");
        float num2 = sc.nextFloat();
        int val1 = (int) (num1 * 1000);
        int val2 = (int) (num2 * 1000);
        if (val1 == val2) {
            System.out.println("The numbers are equal up to three decimal places.");
        } 
        else {
            System.out.println("The numbers are NOT equal up to three decimal places.");
        }
    }
}

