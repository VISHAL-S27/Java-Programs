package com.studyopedia;
import java.util.Scanner;
public class GrtValue {
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the a Value : "); 
int a = sc.nextInt();
System.out.print("Enter the b Value : "); 
int b = sc.nextInt();
System.out.print("Enter the c Value : "); 
int c = sc.nextInt();
if (a >= b && a >= c) {
    System.out.println("A is Greater");
} else if (b >= a && b >= c) {
    System.out.println("B is Greater");
} else {
    System.out.println("C is Greater");
}
}
}