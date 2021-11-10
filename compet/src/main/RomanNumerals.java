package main;

public class RomanNumerals {
	
	public static void main(String[] args) {
		
		String A = "MDCCCIV";
		
		StringBuilder str = new StringBuilder();
		
		str.append(A.charAt(5));
		str.append(A.charAt(6));
		
		//System.out.println(str.toString());
		System.out.println(call("MDCCCIV"));
		
		
	}
	
	static int call(String A)
	{
	int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    int num =0;
    int j =0;
    
    

        while(j < A.length())
        {
    for(int i=0;i<romanLiterals.length;i++) {
    	
    	if(j >=A.length())
    	{
    		break;
    	}

        if(String.valueOf(A.charAt(j)).equals(romanLiterals[i]))
        {
            num = num + values[i];
            j++;
            i=0;
        }
        else {
        	StringBuilder str = new StringBuilder();
        	str.append(A.charAt(j));
        	str.append(A.charAt(j+1));
        	
        	if(str.toString().equals(romanLiterals[i]))
        	{
        		num = num + values[i];
                j = j+2;
                i=0;
        	}
        	
        }
        }
    }
	

    return num;
	}

}
