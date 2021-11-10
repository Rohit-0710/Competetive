package main;

public class Solution2 {
	
	public static void main(String[] args) {
		//gcd(5,10);
		System.out.println(uniquePaths(15, 9));
	}
	
	public static long uniquePaths(int A, int B) {

        if(A == 1 || B==1)
        {
            return 1;
        }

      //  return factorial(A+B-2)/(factorial(A-1) * factorial(B-1));
      return divideandMerge(A+B-2, A)/factorial(B-1);
    }

    private static long factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
            return n * factorial(n-1);
    }

    private static long divideandMerge(int x, int y)
    {
        if(x <=y)
        {
            return y;
        }

        return x* divideandMerge(x-1, y);
    }

	
//	public  static int gcd(int A, int B) {
//        if(A<B)
//        return gcd(B,A);
//        if(B==0)
//            return A;
//        else
//            return gcd(B,A%B);
//    }

}
