package main;

import java.util.HashSet;

public class Difference {
	
	public static void main(String[] args) {
		
		int[] A = {5, 10, 3, 2, 50, 80};
		int B = 78;
		
	System.out.println(test(A,B));
		
	}
		
		static int test(int[] A, int B)
		{
	    HashSet<Integer> map = new HashSet<>();
	    for(int i : A){
	    if( map.contains(i-B) || map.contains(B+i))
	        return 1;
	    map.add(i);
	    }
	    return 0;
		}
		
	}
	

