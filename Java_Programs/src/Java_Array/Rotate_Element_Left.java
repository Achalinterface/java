package Java_Array;

import java.util.Scanner;

public class Rotate_Element_Left {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Orignal array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("How many time you wants to rotate toward left");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int first, j;
			first = array[0];
			for (j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}

			array[j] = first;
		}

		System.out.println();

		System.out.println("Array after left rotation");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}
