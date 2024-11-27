package Java_Array;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int[] frequency = new int[array.length];
		System.out.println("Enter " + size + " elements");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		int visited = -1;

		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}
		System.out.println("Element | Frequency");

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited)
				System.out.println("   " + array[i] + "   " + "      " + frequency[i]);
		}
		scanner.close();
	}
}
