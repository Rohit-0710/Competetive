package main;

public class PerfectPeakOfArray {
	
	
	public static void main(String[] args) {
		int[] A = {9895, 30334, 17674, 23812, 20038, 25668, 6869, 1870, 4665, 27645, 7712, 17036, 31323, 8724, 28254, 28704, 26300, 25548, 15142, 12860, 19913, 32663, 32758 };
		
		System.out.println("Result is "+ perfectPeak(A));
	}
	
	public static int perfectPeak(int[] A) {
		int[] leftMax = leftMax(A);
        int[] rightMin = rightMin(A);

        for(int i=1; i<A.length-1; i++)
        {
            if(A[i] > leftMax[i-1] && A[i] <rightMin[i+1])
            {
                return 1;
            }
        } 
        return 0;
    }

        public static int[] leftMax(int[] A)
        {
            int[] copy = new int[A.length];
              int max =0;
              for(int i=0; i<A.length; i++)
              {
              if(A[i] > max)
              {
                  max = A[i];
              }

              copy[i] = max;
              }
              return copy;
        } 

        public static int[] rightMin(int[] A)
        {
            int[] copy = new int[A.length];
              int max =Integer.MAX_VALUE;
              for(int i=A.length-1; i>=0; i--)
              {
              if(A[i] < max)
              {
                  max = A[i];
              }

              copy[i] = max;
              }

              return copy;
        }
}