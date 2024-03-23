package core;

import java.util.Scanner;

public class P003_TypeCasting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("c = "+c);
		int i =(int)23.1;
		System.out.println(i);
		String iString  = String.valueOf(i);
		double d = 3;
		System.out.println(d);
		String s = "12";
		int l = Integer.parseInt(s);
		System.out.println(l);
		
	}
}
