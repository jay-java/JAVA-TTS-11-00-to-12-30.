package core;
class overload{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int a, int b,int c, int d) {
		return a+b+c+d;
	}
	public double add(float a, double b) {
		return a+b;
	}
}
class Parent{
	public void call() {
		System.out.println("call in parent");
	}
}
class Child extends Parent{
	public void call() {
		super.call();
		System.out.println("call in child");
	}
}
public class P011_Polymorphism {
	public static void main(String[] args) {
		overload o = new overload();
		int res =  o.add(1, 2);
		System.out.println(res);
		Child c = new Child();
		c.call();
	}
}
