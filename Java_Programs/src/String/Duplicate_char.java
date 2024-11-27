package String;

public class Duplicate_char {
	public static void main(String[] args) {
		String s = "Apple is sweet";

		int count;

		char string[] = s.toCharArray();
		System.out.println("Duplicate character are ");

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ') {
					count++;
				}
			}
			if(count > 1 && string[i] != 0) {
				System.out.println(string[i]);
			}
		}
	}
}
