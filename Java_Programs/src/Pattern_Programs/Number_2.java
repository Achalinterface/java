package Pattern_Programs;

import java.util.Scanner;

/*
   5 4 3 2 1
   4 3 2 1
   3 2 1
   2 1
   1
 */
public class Number_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = 5;

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
