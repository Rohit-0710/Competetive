package main;

import java.util.Scanner;

public class IO {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//	    int number = sc.nextInt();
//	    sc.nextLine();
//	    String name = sc.nextLine();
//
//	    System.out.println(number*2);
//	    System.out.println(name);
		
		// Next Problem 
		
//		int row = s.nextInt();
//        int col = s.nextInt();
//        int[][] A = new int[row][col];
//        for(int i=0; i<row; i++)
//        {
//            s.nextLine();
//            for(int j=0; j<col; j++)
//            {
//                A[i][j] = s.nextInt();
//            }
//            
//        }
//
//        int[][] B = new int[col][row];
//        for(int i=0; i<col; i++)
//        {
//            for(int j=0; j<row; j++)
//            {
//                B[i][j] = A[j][i];
//            }
//            
//        }
//
//        for(int i=0; i<col; i++)
//        {
//            for(int j=0; j<row; j++)
//            {
//                System.out.print(B[i][j] + " ");
//            }
//            System.out.print("\n");
//            
//        }

		// Next Problem
		
		int testCase = s.nextInt();
        for(int t =0; t<testCase; t++)
        {
        s.nextLine();
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] A = new int[row][col];
        for(int i=0; i<row; i++)
        {
            s.nextLine();
            for(int j=0; j<col; j++)
            {
                A[i][j] = s.nextInt();
            }
            
        }
        int maxElement = A[0][0];
//        int maxElementRow = 0;
//        int maxElementCol = 0;
        int minElement = A[row-1][col-1];
//        int minElementRow = row-1;
//        int minElementCol = col-1;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(A[i][j] > maxElement)
                {
                    maxElement = A[i][j];
//                    maxElementRow = i;
//                    maxElementCol = j;
                }

                if(A[i][j]< minElement)
                {
                    minElement = A[i][j];
//                    minElementRow = i;
//                    minElementCol = j;
                }

            }
            
        }

        int[][] B = new int[row][col];
        
        for(int i=0; i<row; i++)
        {
        	for(int j=0; j<col; j++)
        	{
        		if(A[i][j] == maxElement)
        		{
        			for(int p =0; p<col; p++)
        			{
        			B[i][p] = Integer.MAX_VALUE;
        			}
        			
        			for(int p =0; p<row; p++)
        			{
        			B[p][j] = Integer.MAX_VALUE;
        			}
        			
        		}
        		
        		if(A[i][j] == minElement)
        		{
        			for(int p =0; p<col; p++)
        			{
        			B[i][p] = Integer.MAX_VALUE;
        			}
        			
        			for(int p =0; p<row; p++)
        			{
        			B[p][j] = Integer.MAX_VALUE;
        			}
        		}
        	}
            
        }

        int count =0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(B[i][j] < Integer.MAX_VALUE)
                {
                    count++;
                }
            }
            
        }

        System.out.println(count);

    }
        

  }
}