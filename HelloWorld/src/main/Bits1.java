package main;

import java.util.ArrayList;

public class Bits1 {
	
	public static void main(String[] args) {
		//System.out.println(good());
		hi();
	}
	
	private static int good() {
		int count = 0;
	    long a = 11;
	    while (a != 0) {
	        a &= a - 1;
	        count++;
	    }
	    
	    return count; 
		
	}
	
	private static void hi()
	{
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> e = new ArrayList<Integer>();
		
		
		e.add(1);
		e.add(2);
		list.add(e);
		
		
		
		System.out.println(list.size());
	}
	
	
	// 1011
	// 1010
	//=1010
	// 1001 
	//=1000
	// 0111
	//=0000

	

}
