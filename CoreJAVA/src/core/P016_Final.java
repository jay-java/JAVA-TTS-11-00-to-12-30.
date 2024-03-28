package core;

final class aa{
	final int a = 12;
	 final public void change() {
//		a++;
		System.out.println(a);
	}
}
class bb extends aa{
	public void change() {
		System.out.println("change function in b class");
	}
}
public class P016_Final {
	public static void main(String[] args) {
		aa a = new aa();
		a.change();
	}
}
