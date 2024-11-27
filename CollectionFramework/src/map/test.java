package map;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 101);
		hm.put(2, 102);
		hm.put(3, 103);
		System.out.println(hm);

		System.out.println(hm.entrySet());

		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue(11));

		System.out.println(hm.get(3));
		System.out.println(hm.keySet());

		for (Map.Entry h : hm.entrySet()) {
			System.out.println(h.getKey() + "=>" + h.getValue());
		}

		hm.remove(2);
		System.out.println(hm);
	}
}
