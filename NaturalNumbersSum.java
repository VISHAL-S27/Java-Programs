package com.studyopedia;
import java.util.Scanner;
public class NaturalNumbersSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Numbers : ");
		int num = sc.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}

}
