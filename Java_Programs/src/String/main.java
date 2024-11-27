package String;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static Map<Character, Integer> CountOccurance(String str){
		str = str.toLowerCase();
		Map<Character, Integer> occurance = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(c != ' ') {
			if(occurance.containsKey(c)) {
				occurance.put(c, occurance.get(c) + 1);
			}else {
				occurance.put(c, 1);
			}
			}
		}
		return occurance;
	}
	
}
