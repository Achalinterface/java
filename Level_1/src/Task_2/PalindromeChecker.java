package Task_2;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word/phrase");
		String input = scanner.nextLine();

		String ignoreSpaceAndPunctuation = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

		boolean isPalindrome = checkPalindrome(ignoreSpaceAndPunctuation);

		if (isPalindrome) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
		scanner.close();
	}
	public static boolean checkPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
