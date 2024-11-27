package Java_Array;

import java.util.Scanner;

public class Copy_elements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want");
		int size = scanner.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[array1.length];
		System.out.println("Enter " + size + " elements");

		for (int i = 0; i < size; i++) {
			array1[i] = scanner.nextInt();
		}

		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println("Elements of original array ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("Elements of Copied array");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		scanner.close();
	}
}
