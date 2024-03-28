package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P025_TreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(345);
		set.add(34567);
		set.add(314535);
		set.add(-156);
		set.add(0);
		set.add(-1);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
