package Pattern_Programs;

import java.util.Scanner;

/*
  	5 5 5 5 5 
  	4 4 4 4  
  	3 3 3
  	2 2 
  	1
 */
public class Number_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =5;
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
