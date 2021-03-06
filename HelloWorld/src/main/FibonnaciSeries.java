package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonnaciSeries {

	static int n1 = 0;
	static int n2 = 1;

	/*
	 * Used for non- recursive way
	 */
//	public static void printFibonacciSeries(int count) {
//		int a = 0;
//		int b = 1;
//		int c = 1;
//		for (int i = 1; i <= count; i++) {
//			System.out.print(a + ", ");
//			a = b;
//			b = c;
//			c = a + b;
//		}
//	}

	public static void Fibonacci(int n) {

		if (n > 0) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			if (n3 == 1) {
				System.out.print(0 + " " + 1);
			}
			System.out.print(" " + n3);
			Fibonacci(n - 1);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Fibonacci(Integer.parseInt(br.readLine()) - 1);

	}

}
