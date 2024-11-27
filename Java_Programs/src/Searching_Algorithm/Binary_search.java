package Searching_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

	public static int binary(int[] array, int target) {
		Arrays.sort(array);

		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
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
		int index = binary(array, target);
		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found");
		}
		scanner.close();
	}
}
