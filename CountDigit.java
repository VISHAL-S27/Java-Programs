package com.studyopedia;
import java.util.Scanner;
public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		int num = sc.nextInt();
		int count=0;
		while(num>0) {
			num/=10;
			++count;
		}
		System.out.println(count);
	}
}
