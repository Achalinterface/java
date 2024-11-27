package String;

public class Permutation {

	public static void generatePermutation(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);
				generatePermutation(str, start + 1, end);
				str = swapString(str, start, i);
			}
		}
	}

	private static String swapString(String str, int i, int j) {
		char[] a = str.toCharArray();
		char ch;

		ch = a[i];
		a[i] = a[j];
		a[j] = ch;
		return String.valueOf(a);
	}

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		System.out.println("All the permutation of string are ");
		generatePermutation(str, 0, len);
	}
}
