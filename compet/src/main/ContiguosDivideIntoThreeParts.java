package main;

public class ContiguosDivideIntoThreeParts {
	
	public static void main(String[] args) {
		int A = 5;
		int[] B = {1, 2, 3, 0, 3};
		System.out.println(solve(A, B));
	}
	
	public static int solve(int A, int[] B) {
		
		A+=2;
		System.out.println(A);
		A=+2;
		System.out.println(A);
        
        int count =0;
        for(int a=0; a<A; a++)
        {
        	int sumA =0;
        for(int i=0; i<=a; i++)
        {
          sumA = sumA + B[i];
        }
        int sumB = 0;
        for(int i=a+1; i<A-1; i++)
        {
            int sumC =0;
            sumB = sumB + B[i];
            for(int j=i+1; j<A; j++)
            {
                sumC = sumC + B[j];
            }
          if(sumA == sumB && sumB == sumC)
        {
            count++;
        }
        }
        }
        return count;
    }
}
