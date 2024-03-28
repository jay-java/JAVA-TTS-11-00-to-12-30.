package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P023_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("java");
		set.add('d');
		set.add(314535);
		set.add(1);
		set.add("java");
		set.add(false);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
