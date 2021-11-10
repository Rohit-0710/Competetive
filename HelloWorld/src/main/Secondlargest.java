package main;

public class Secondlargest {
	
	public static void main(String[] args) {
		int[] Arr = {1 ,2 , 10, 7, 8, 15};
		
		
		
		System.out.println(solution(Arr));
	}

	private static int solution(int[] A) {
		// TODO Auto-generated method stub
		
		int max = A[0];
		int index = 0;
		for(int i =1; i<A.length; i++)
		{
			if(A[i]> max)
			{
				max = A[i];
				index = i;
			}
		}
		
		
		A[index] = A[0];
		A[0] = max;
		
		int max2 = A[1];
		for(int i =2; i<A.length; i++)
		{
			if(A[i]> max2)
			{
				max2 = A[i];
			}
		}
		
		return max2;
	}

}
