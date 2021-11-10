package main;

import java.util.Arrays;

public class NobleInteger {
	
	public static void main(String[] args) {
		int[] A = {-2, 8, 8, 6, -2, 3, -2, -7, 3, 3, -2, 0, 4, -3, -4, -2, -1, -10, -4, -2, 7, -1, 0, -7, 3, -7, 7, 3, 2, -4, -5, 2, 6, 5, -2, 7, -1, 6, -10, 4, -9, -10, -6, -2, -3, 0, -2, 6, -8, 4, 7, 9, -7, 9, -8, -2, -7, -10, -9, -3, 8, 9, 1, 5, 4, 9, 2, 5, -3, -6, -1, -1, -6};

		
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		Arrays.sort(A);

        for(int i=0; i<A.length; i++)
        {
            if(A[i] >= 0)
            {
            if(A[i] == A.length - i -1)
            {
                if(i ==0 || i== A.length-1)
                {
                    return 1;
                }
                else if(i > 0 && i <A.length-1)
                {
                    if(A[i] != A[i+1])
                    {
                        return 1;
                    }
                }
            
            }
        }
        }
        return -1;
    }

}
