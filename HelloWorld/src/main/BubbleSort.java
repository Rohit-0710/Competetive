package main;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray = new int[7];

		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		int lastvariable = 7;

		for (int j = lastvariable - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (intArray[i] > intArray[i + 1]) {
					int test = intArray[i + 1];
					intArray[i + 1] = intArray[i];
					intArray[i] = test;
				}

			}

		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
