package main;

public class AddOneToNumber {
	public static void main(String[] args) {
		int[] A = { 9, 9, 9, 9, 9 };
		int [] B = plusOne(A);
		for (int i = 0; i < B.length; i++) {
			System.out.println("Result is  " + B[i]);
		}
	}

	public static int[] plusOne(int[] A) {

		int carry = 1;
		for (int i = A.length - 1; i >= 0; i--) {
			int sum = A[i] + carry;
			A[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry > 0) {
			int b[] = new int[A.length + 1];
			b[0] = carry;
			for (int i = 1; i < A.length + 1; i++) {
				b[i] = A[i - 1];
			}
			return b;
		} else {
			int pp = 0;
			while (A[pp] == 0) {
				pp++;
			}
			int b[] = new int[A.length - pp];
			if (pp > 0) {
				for (int i = pp; i < A.length; i++) {
					b[i - pp] = A[i];
				}
				return b;
			} else {
				return A;
			}

		}
	}
}
