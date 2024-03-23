package core;
interface inter1{
	public void fun1();
	public static void staticinte1() {
		System.out.println("static in interface 1");
	}
}
interface inter2 extends inter1{
	public void fun2();
	public static void staticinte2() {
		System.out.println("static in interface 2");
	}
}
interface inter3{
	public void fun3();
	public static void staticinte3() {
		System.out.println("static in interface 3");
	}
}
class InterCall implements inter2,inter3{

	

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}
	
}
public class P015_Interface {
	public static void main(String[] args) {
		inter1.staticinte1();
	}
}
