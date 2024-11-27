package Searching_Algorithm;

import java.util.Scanner;

public class Linear_Search {

	public static int linear(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter target element");
		int target = scanner.nextInt();
		int index = linear(array, target);
		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found");
		}
		scanner.close();
	}
}
