package main;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = 35;

		b = b + a;
		a = b - a;
		b = b - a;

		System.out.printf("a is %d , b is %d", a, b);
	}

}
