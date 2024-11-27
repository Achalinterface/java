package Java_Array;

public class PairOfSum {
	public static void main(String[] args) {
		int[] array = { 8, 3, 5, 6, 3, 2, 9 };
		int target = 13;
		findPair(array, target);
	}

	public static void findPair(int[] arr, int target) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.printf("pair found (%d, %d)", arr[i], arr[j]);
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}
}
