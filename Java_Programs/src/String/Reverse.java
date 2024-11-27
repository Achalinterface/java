package String;

public class Reverse {
	public static void main(String[] args) {
		String s = "Just do it";
		System.out.println("Original " + s);
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
