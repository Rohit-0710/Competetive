package main;

public class MergeSort {
	
	//static int[] intArray = new int[7];

//	intArray[0] = 20;
//	intArray[1] = 35;
//	intArray[2] = -15;
//	intArray[3] = 7;
//	intArray[4] = 55;
//	intArray[5] = 1;
//	intArray[6] = -22;
	
	public static void main(String[] args) {
//		int[] intArray = new int[7];
//
//		intArray[0] = 20;
//		intArray[1] = 35;
//		intArray[2] = -15;
//		intArray[3] = 7;
//		intArray[4] = 55;
//		intArray[5] = 1;
//		intArray[6] = -22;
		
		int[] intArray = {2, 8, 10, 12, 3, 6, 11, 14};
		
		mergeSort(intArray, 0, intArray.length-1);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

}
	
	private static void mergeSort(int[] input, int start, int end) {

//		if(end - start < 2)
//		{
//			return;
//		}
		
		if(end > start)
		{
		int mid = (end+start)/2;
		
		//0,3,7
		//0,1,3
		//0,1,2
		
		//1,7
		
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end);
		merge(input, start, mid, end);
		}
	}

	private static void merge(int[] Arr, int start, int mid, int end) {
		
		int temp[] = new int[end - start + 1];

		// crawlers for both intervals and for temp
		int i = start, j = mid+1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in temp 
		while(i <= mid && j <= end) {
			if(Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k += 1; i += 1;
			}
			else {
				temp[k] = Arr[j];
				k += 1; j += 1;
			}
		}

		// add elements left in the first interval 
		while(i <= mid) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}

		// add elements left in the second interval 
		while(j <= end) {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}

		// copy temp to original interval
		for(i = start; i <= end; i += 1) {
			Arr[i] = temp[i - start];
		}
		
		// This will also work
//		int m=0;
//		for(i = start; i <= end; i += 1) {
//			Arr[i] = temp[m++];
//		}
	}
		}
