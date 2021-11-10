package main;

import java.util.Arrays;



public class CutFromTreeBinarySearch {
	
	public static void main(String[] args) {
		int[][] A = {{1, 3, 5},
	            {2, 6, 9},
	            {3, 6, 9}};
		System.out.println(findMedian(A));
	}
	
	
//	    public static int solve(int[] A, int B) {
//	        Arrays.sort(A);
//	        int y =A.length-1;
//	        int start = 0;
//	        int end = A.length;
//
//	        while(end > start)
//	        {
//	            int mid = (start + end)/2;
//	            if(A[mid] > B)
//	            {
//	                end = mid;
//	            }
//	            else
//	            {
//	                 start = mid + 1;
//	            }
//	        }
//
//	        // end index is the index after which elements are greater than B
//
//	        int i=0;
//
//	        int sum = 0;
//            for(int j=0; j<A.length-end; j++)
//            {
//                sum = sum + A[end + j];
//            }
//            
//            
//            A[end] - x
//
//	        while(i < A[end+1])
//	        {
//		           
//	            if(sum - i*(A.length - end) - B < 0)
//	            {
//	                break;
//	            }
//	            else{
//	                i++;
//	            }
//	        }
//	        return A[end] + i-1;
//	    }
	
	public static int findMedian(int[][] A) {

        int x = A[0][0];
        while(x < A[A.length-1][A[0].length-1])
        {
        int counter =0;
        for(int j =0; j<A.length; j++)
        {
        	int start = 0;
            int end =A.length;
            
            while(end > start)
            {
            	int mid = (start+end)/2;
            if(A[mid][j] <=x)
            {
                counter++;
                start = mid+1;
            }
            else{
                end = mid;
            
            }
            }
        

            if((A.length*A[0].length) % 2 !=0)
            {
                if((A.length*A[0].length + 1)/2 == counter)
                {
                    return A[end][j];
                }
                
            }
            else{
                if((A.length*A[0].length-1 + 1)/2 == counter)
                {
                return Math.min(A[end][j] + A[end+1][j], A[end][j] + A[end][j+1])/2;
                }
               
            }
        }
        x++;
        }

        return -1;
    }
	}
