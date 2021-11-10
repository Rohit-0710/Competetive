package main;

public class MinLightsToActivateDynamicProgg {
	
	public static void main(String[] args) {
		int [] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
			int	B = 4;
	System.out.println( solve(A, B));
	}
	    public static int solve(int[] A, int B) {
	    	int n = A.length;
	        int attempt=0;
	        int maxPos = Math.min(B-1, n-1);
	            while(maxPos>=0)
	                {
	                   if(A[maxPos] == 1)
	                   {
	                       attempt++;
	                       A[maxPos]=2;
	                       maxPos = maxPos+B;
	                       if(maxPos >=n)
	                       {
	                           break;
	                       }
	                       maxPos = Math.min(n - 1, maxPos + B - 1);
	                       
	                   }
	                   else if(A[maxPos] == 2)
	                   {
	                       break;
	                   }
	                   else{
	                       maxPos--;
	                   }
	                }

	                if(maxPos + B - 1 < n-1)
	                {
	                    return -1;
	                }
	                return attempt;

	          
	      }
	}

