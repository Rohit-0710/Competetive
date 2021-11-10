package main;

public class Puzzle {
	
	public static void main(String[] args) {
		int open = 100;
		int closed = 0;
		
		int count =0;
		
		int[] arr = new int[55];
		
		for(int i=1; i<=55; i++)
		{
			for(int j=0; j<55; j+=i)
			{
				if(arr[j] == 0)
				{
					arr[j] = 1;
				}
				else {
					arr[j] = 0;
				
			}
		}
		}
		
		for(int i=0; i<55; i++)
		{
			if(arr[i] == 0)
			{
				count++;
			}
		}
		
		System.out.println(55 - count);
	}

}
