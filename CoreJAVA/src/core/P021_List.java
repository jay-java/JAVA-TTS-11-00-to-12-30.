package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P021_List {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
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
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
