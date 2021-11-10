package main;

public class CircularString {
	
	public static void main(String[] args) {
		
		String[] A = { "a", "ababa", "aba" };
		
		System.out.println(call(A));
		
	}
	
	private static int call(String[] A) {
		
		int[] B = new int[A.length];
	    int k=0;
	    for(int i=0; i<A.length; i++)
	    {
	    	if(A[i].length() == 1)
	    	{
	    		B[k++] = 1;
	    	}
	        for(int j=1; j<A[i].length(); j++)
	        {
	        if(A[i].equals(rightrotate(A[i] , j)))
	        {
	            B[k++] = j;
	            break;
	        }
	        }
	    }

	  return  findGCD(B, B.length);

	}
static String leftrotate(String str, int d)
{
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
}

// function that rotates s towards right by d
 static String rightrotate(String str, int d)
{
        return leftrotate(str, str.length() - d);
}

static int gcd(int a, int b)
{
    if (a == 0)
        return b;
    return gcd(b % a, a);
}

// Function to find gcd of array of
// numbers
 static int findGCD(int arr[], int n)
{
    int result = 0;
    for (int element: arr){
        result = gcd(result, element);

        if(result == 1)
        {
           return 1;
        }
    }

    return result;

}
}
