package main;

public class KMPAlgo {
	
	public static void main(String[] args) {
		String search = "ababcabcabababd";
		String pattern = "AAACAAAA";
		
		kmp(search, pattern);
	}

	private static void kmp(String search, String pattern) {
		
		int index =0;
		int i=0;
		int j=0;
		boolean check = false;
		
		int [] lps = compute_LPS_Array(pattern);
		

		while(i >=0 && i<search.length())
		{
			while(j >=0 && j<pattern.length())
			{
				if(search.charAt(i) == pattern.charAt(j))
				{
					j++;
					i++;
				}
				
				else {
					if(j > 0)
					{
					j = lps[j-1];
					
					index = 0;
					}
					else {
						j=0;
					}
					i++;
				}
				
				if(i == search.length() || j == pattern.length())
				{
					check = true;
					break;
				}
			}
			
			if(j == pattern.length())
			{
				break;
			}
		}
		
		System.out.println(i - pattern.length());
		
	}
	
	public static int[] compute_LPS_Array(String pattern){
        int N = pattern.length();
        int lps[] = new int[N];
        lps[0] = 0;
        int i = 1,len = 0;
        
        while(i<N){
            if(pattern.charAt(i)==pattern.charAt(len))
                lps[i++] = (++len);
            else{
                if(len==0)
                    lps[i++] = len;
                else
                    len = lps[len-1];
            }
        }
        return lps;
    }

}
