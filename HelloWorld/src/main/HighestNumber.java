package main;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 5 ,3 ,2, 9, 7 };
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
			else if(smallest>arr[i])
			{
				smallest = arr[i];
			}
		}

		System.out.println("Largest Number is "+ largest);
		System.out.println("Smallest Number is "+smallest);
	}

}
