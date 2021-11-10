package main;

public class MaxSumTriplet {

	public static void main(String[] args) {
		int[] A = { 2, 5, 3, 1, 4, 9 };
		int sum = rec(A) + rec(A) + rec(A);
		System.out.println(sum);
	}

	public static int rec(int[] A) {
		int largest = A[0];
		int index = 0;

		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[i - 1] && i > i - 1) {
				largest = A[i];
				index = i;
			}
		}

		for (int i = index; i < A.length - 1; i++) {
			A[i] = A[i + 1];
		}
		A[A.length - 1] = -1;
		return largest;

	}
}
