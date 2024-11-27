package Java_Array;

import java.util.Scanner;

public class Desending_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you want ");
		int size = sc.nextInt();

		int temp = 0;
		int[] array = new int[size];
		System.out.println("Enter " + size + " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Original array ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println("Element in descending order");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
