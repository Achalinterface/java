package Pattern_Programs;

import java.util.Scanner;

/*
	1
	1 2	
	1 2 3
	1 2 3 4
	1 2 3 4 5
*/
public class Number_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 5;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
