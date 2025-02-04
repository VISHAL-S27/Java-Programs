package com.studyopedia;
import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Value : ");
	int a = sc.nextInt();
	System.out.print("Enter b Value : ");
	int b = sc.nextInt();
		int c=1;
		while(b>0) {
			c=c*a;
			b--;
		}
		System.out.println("Power of the Number is : " + c);
	}
}
