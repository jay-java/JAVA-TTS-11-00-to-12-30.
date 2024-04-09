class A {
	static int o = 12;

	public static void change() {
		o++;
		System.out.println(o);
	}
}

public class first {
	public static void main(String[] args) {
		System.out.print("hello java\t");
		System.out.println("hello java");
		System.out.println("hello");
		System.out.println(1 * 2);
		A a = new A();
		a.change();
	}
}
