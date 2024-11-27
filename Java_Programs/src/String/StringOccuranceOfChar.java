package String;

import java.util.Map;

public class StringOccuranceOfChar extends main {
	public static void main(String[] args) {
		String str = "Gooooooooogle";
		Map<Character, Integer> occurance = CountOccurance(str) ;
		System.out.println("Occurance of each character in a string ");
		for (Map.Entry<Character, Integer> entry : occurance.entrySet()) {
			System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
		}

	}
}