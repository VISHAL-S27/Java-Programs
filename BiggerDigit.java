package com.studyopedia;
import java.util.Scanner;
public class BiggerDigit {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();
    scanner.close();
    int maxDigit = 0;  
    while (num != 0) {
        int digit = num % 10; 
        if (digit > maxDigit) 
            maxDigit = digit;
        num /= 10; 
    }
    System.out.println("Largest digit: " + maxDigit);
    }
}

