package main;

public class NeedleHaystack {
	
	public static void main(String[] args) {
		String A = "bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba";
			String B = "babaaa";
		System.out.println(call(A, B));
	}

	static int call(String A, String B)
	{
		boolean ans = false;
        int j=0;
        int index =-1;

        if(A.length() == 0 || B.length() == 0)
        {
            return -1;
        }

        for(int i=0; i<A.length(); i++)
        {
        	if(index == i)
        	{
        		continue;
        	}
            if(String.valueOf(A.charAt(i)).equals(String.valueOf(B.charAt(j))))
            {
            	System.out.println("Index =" + i + "valueOf A =" + String.valueOf(A.charAt(i)) + "index of B =" + j + "valueOf B =" + String.valueOf(B.charAt(j)) );
                index = i;
                j++;
            }
            else{
            	if(i > B.length()-j -1)
            	{
            		i = B.length()-j -1;
            	}
            	else {
            		i=0;
            	}
                j=0;
//                if(String.valueOf(A.charAt(i)).equals(String.valueOf(B.charAt(j))))
//                {
//                	System.out.println("Index =" + i + "valueOf A =" + String.valueOf(A.charAt(i)) + "index of B =" + j + "valueOf B =" + String.valueOf(B.charAt(j)) );
//                    index = i;
//                    j++;
//                }
            }
            
            if(j== B.length())
            {
                ans = true;
                break;
            }
        }

        if(ans)
        {
            return index- B.length()+1;
        }
        else{
            return -1;
        }

	}
}
