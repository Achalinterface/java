package Java_Array;

import java.util.Scanner;

public class Rotate_Element_Right {

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
		System.out.println("How many time you wants to rotate toward right");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int last, j;
			last = array[array.length - 1];
			for (j = array.length - 1; j > 0; j--) {
				array[j] = array[j - 1];
			}

			array[0] = last;
		}

		System.out.println();

		System.out.println("Array after right rotation");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}
