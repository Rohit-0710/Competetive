package main;

public class QuickSort {

	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		quickSort(intArray, 0, intArray.length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void quickSort(int[] intArray, int start, int end) {
		// TODO Auto-generated method stub

		if (end - start < 2) {
			return;
		}

		int pivotIndex = partition(intArray, start, end);

		quickSort(intArray, start, pivotIndex);
		quickSort(intArray, pivotIndex + 1, end);

	}

	private static int partition(int[] input, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = input[start];

		int i = start;
		int j = end;

		while (i < j) {
			while (i < j && input[--j] >= pivot)
				;

			if (i < j) {
				input[i] = input[j];
			}

			while (i < j && input[++i] <= pivot)
				;

			if (i < j) {
				input[j] = input[i];
			}

		}
		input[j] = pivot;
		return j;
	}

}
