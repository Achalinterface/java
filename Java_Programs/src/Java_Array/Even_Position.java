package Java_Array;

import java.util.Scanner;

public class Even_Position {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you want ");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter " + size + " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Element of given array present on even position");

		for (int i = 1; i < array.length; i = i +2) {
			System.out.print(array[i] + " ");
		}
			sc.close();
	}
}
