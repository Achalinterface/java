package Java_Array;

import java.util.Scanner;

public class Sum_of_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you want ");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter " + size + " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0 ; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of element is: " + sum);
		sc.close();
	}
}
