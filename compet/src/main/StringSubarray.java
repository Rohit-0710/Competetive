package main;

public class StringSubarray {
	
	public static void main(String[] args) {
		
		String A = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
		
		System.out.println(answer(A));
	}
	
	static int  answer(String A)
	{
	int sum =0;
    A = A.toUpperCase();
    for(int i=0; i<A.length(); i++)
    {
        if(String.valueOf(A.charAt(i)).equalsIgnoreCase("A") || String.valueOf(A.charAt(i)).equalsIgnoreCase("E")
         || String.valueOf(A.charAt(i)).equalsIgnoreCase("I") || String.valueOf(A.charAt(i)).equalsIgnoreCase("O")
          || String.valueOf(A.charAt(i)).equalsIgnoreCase("U"))
        {
            sum+= A.length() -i;
        }
    }

    return sum%10003;
	}

}
