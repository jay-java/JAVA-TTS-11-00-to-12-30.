package core;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide{//B
	public void division() throws ArithmeticException,InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int res = a/b;
		if(b<0) {
			throw new ArithmeticException("");
		}
		else {
			int c = a/b;
			System.out.println(c);
		}
	}
}
public class P017_Exception {//A
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println(c);
//			System.exit(0);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this block will execute everytime");
//		}
	}
}
