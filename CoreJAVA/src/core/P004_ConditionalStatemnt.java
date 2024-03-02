package core;

import java.util.Scanner;

public class P004_ConditionalStatemnt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		// 1.simple if
		if (a > b) {
			System.out.println("a is greater");
		}

		// 2.if else
		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		// 3.nested if
		System.out.println("enter age = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("eligible");
			} else {
				System.out.println("age is greater than not but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		System.out.println("enter marks = ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("D grade");
		} else if (m >= 35 && m <= 60) {
			System.out.println("D grade");
		} else if (m >= 61 && m <= 70) {
			System.out.println("C grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("enter your choice : \n1.English\n2.Hindi\3.Gujarati");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected Gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
