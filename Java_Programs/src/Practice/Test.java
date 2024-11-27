package Practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = { 111, 100, 99, 5 };
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] == array[j]) {
//					System.out.println(array[j]);
//				}
//			}
//		}
//		int temp;
//		for(int i = 0 ; i < array.length; i++) {
//			for(int j = i+1; j < array.length; j++) {
//				if(array[i] > array[j]) {
//					temp = array[j];
//					array[j] = array[i];
//					array[i] = temp;
//				}
//			}
//		}
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		for(int i = 0 ; i < array.length; i++) {
//			if(array[i] % 2 == 0) {
//				System.out.println(array[i]);
//			}
//		}
//		
		int rev = 0;
		for (int i = 0; i < array.length; i++) {

			int number = array[i];
			int rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
			System.out.println(rev);
		}
		;

		scanner.close();
	}
}
