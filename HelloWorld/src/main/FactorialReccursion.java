package main;

public class FactorialReccursion {
	
	public static void main(String[] args) {
		int n =5;
		System.out.println("factorial of " + n + " is " + factorial(n));
	}

	public static int factorial(int n) {
//		int j =1;
//		if(n-1>0)
//		{
//		j = n *factorial(n-1);			
//		}
//		else {
//			j=j*1;
//		}
		if(n ==0)
		{
			return 1;
		}
		return n*factorial(n-1);
		
		
	}
}
