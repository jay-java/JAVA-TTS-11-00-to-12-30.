package core;

import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class P024_Vectorr {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(12);
		list.add("java");
		list.add('g');
		list.add(234.33);
		list.add(false);
		list.add(122354);
		System.out.println(list);
		list.add("new data");
		list.add(12);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		Enumeration em = list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
