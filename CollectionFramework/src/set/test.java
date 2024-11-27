package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");

		TreeSet<Integer> ts = new TreeSet();
		TreeSet<String> ts2 = new TreeSet<>(hs);
		ts.add(3);
		ts.add(5);
		ts.add(7);
		ts.add(2);
		System.out.println(ts);
		System.out.println(ts2);
		System.out.println(hs);

		Iterator i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
