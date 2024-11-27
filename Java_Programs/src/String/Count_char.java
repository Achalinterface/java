package String;

public class Count_char {
	public static void main(String[] args) {
		String string = new String("Apples are red");
		int count = 0;
		System.out.println(string.length());
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
