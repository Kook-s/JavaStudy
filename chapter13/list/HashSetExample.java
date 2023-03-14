package chapter13.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		System.out.println("총 객체수: " + set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수: " + set.size());

		iterator = set.iterator();

		for (String elemnet : set) {
			System.out.println("\t" + elemnet);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}

	}
}
