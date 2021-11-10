package main;

import java.util.Arrays;

public class MaxMinSum {
	
	public static void main(String[] args) {

		int[] A = { 5, -2, 3, 1, 2 };

		int[] result = solve(A);

		System.out.println("result is" + (result[0] + result[1]));
	}

	private static int[] solve(int[] A) {
		int n= A.length;
		
		int[] temp = new int[2];
		
		if(A.length == 1)
		{
			temp[0] = A[0];
			temp[1] = A[0];
		}
		else {
		int[] lr = solve(Arrays.copyOfRange(A, 0, n/2));
		int [] sm =	solve(Arrays.copyOfRange(A, n/2, n));
			temp[0] = Math.min(lr[0], sm[0]);
			temp[1] = Math.max(lr[1], sm[1]);
		}
		
	
		return temp;
	}
		
	
//	My Sol'n
//	public static int solve(int[] A) {
//
//        int largest = A[0];
//        for (int i=0; i<A.length; i++)
//        {
//            if(A[i] > largest)
//            {
//                largest = A[i];
//            }
//        }
//        int smallest = A[0];
//        for (int i=0; i<A.length; i++)
//        {
//            if(A[i] < smallest)
//            {
//                smallest = A[i];
//            }
//        }
//        return largest+smallest;
//
//    }
}

