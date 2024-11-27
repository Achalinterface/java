package Java_Array;

import java.util.Scanner;

public class Largest_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you want ");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter " + size + " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("Largest element in array: " + max);
		sc.close();
	}
}
