package core;
class A1{
	A1(){
		System.out.println("defualt cons in A");
	}
	public void classA() {
		System.out.println("class A");
	}
}
class B extends A1{
	public void classB() {
		System.out.println("class B");
	}
}
class C extends B{
	public void classC() {
		System.out.println("class C");
	}
}
class D extends A1{
	public void classD() {
		System.out.println("class A");
	}
}
//class E extends D,A{
//	
//}
public class P010_Inheritance {
	public static void main(String[] args) {
		C c = new C();
		c.classB();
		c.classC();
		D d = new D();
	}
}
