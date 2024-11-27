package Pattern_Programs;

import java.util.Scanner;

/*
   5 4 3 2 1
   4 3 2 1
   3 2 1
   2 1 
   1
 */
public class Number_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
