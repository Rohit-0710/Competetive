package main;

public class MaxSumPickFromStartOrEndOrFromBoth {

	public static void main(String[] args) {

		int[] A = { 5, -2, 3, 1, 2 };
		int B = 3;

		int result = solve(A, B);

		System.out.println("result is" + result);
	}

//	public static int solve(int[] A, int B) {
//		int n = A.length;
//		int[] prefix = new int[n];
//
//		int[] suffix = new int[n];
//		prefix[0] = A[0];
//		suffix[0] = A[n - 1];
//		int[] tempArray = new int[B+1];
//		for (int i = 1; i < n; i++) {
//			prefix[i] = prefix[i - 1] + A[i];
//			suffix[i] = suffix[i - 1] + A[n - i - 1];
//		}
//		tempArray[0] = prefix[B - 1];
//		tempArray[B] = suffix[B-1];
//		for (int a = 1; a < B; a++) {
//			tempArray[a] = prefix[B - 1 - a] + suffix[a - 1];
//		}
//
//		int max = tempArray[0];
//		for (int j = 0; j <tempArray.length; j++) {
//			if (tempArray[j] > max) {
//				max = tempArray[j];
//			}
//		}
//
//		return max;
//	}
	
	public static int solve(int[] A, int B) {
        int ans = 0, temp = 0;
	        for(int i = 0; i<B; i++){
	            ans = ans + A[i];
	        }
	        temp = ans;
	        for(int i = 0; i<B; i++){
	            temp = temp - A[B-i-1] + A[A.length-i-1];
	            ans = Math.max(ans, temp);
	        }
	        return ans;
   }
}
