package core;

import java.util.Scanner;

public class qqq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		int counter = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(counter<=num) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
