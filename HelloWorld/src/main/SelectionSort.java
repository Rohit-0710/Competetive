package main;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = new int[7];

		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}

			}

			swap(intArray, largest, lastUnsortedIndex);

		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void swap(int[] arr, int i, int j) {

		if (i == j) {
			return;
		}

		int test = arr[j];
		arr[j] = arr[i];
		arr[i] = test;

	}
}
