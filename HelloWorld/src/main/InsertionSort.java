package main;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = new int[7];

		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		// Assuming 0th index is sorted
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];

			int j;
			for (j = firstUnsortedIndex; j > 0 && intArray[j - 1] > newElement; j--) {

				intArray[j] = intArray[j - 1];
			}

			intArray[j] = newElement;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
