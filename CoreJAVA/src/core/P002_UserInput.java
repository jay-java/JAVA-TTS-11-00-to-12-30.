package core;

import java.util.Scanner;

class A{
	public void run() {
		System.out.println("run function");
	}
}
public class P002_UserInput {
	public static void main(String[] args) {
		A obj = new A();
		obj.run();
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("a = "+a);
		System.out.println("enter d = ");
		double d = sc.nextDouble();
		System.out.println("d = "+d);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println(name);
		
	}
}
