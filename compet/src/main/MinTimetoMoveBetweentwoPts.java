package main;

public class MinTimetoMoveBetweentwoPts {
	
	    public int coverPoints(int[] A, int[] B) {

	        int dis =0;


	        for(int i=1; i<A.length; i++)
	        {
	            dis= dis + Math.max(Math.abs(A[i]-A[i-1]) ,Math.abs(B[i]-B[i-1]));
	        }

	        return dis;
	    }
	}
