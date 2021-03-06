package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	
	public static int[] arr = {1 , 4 ,6 ,7 ,8 , 2, 4, 3, 1 ,5 ,6, 7, 1, 5, 9};
	
	public static void duplicate(int[] t)
	{
		
		Set<Integer> set = new HashSet<>();
		
		for(int i:t)
		{
			if(set.add(i) == false)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static void duplicate2 (int[] t)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		
		for (int i:t)
		{
			Integer count = map.get(i);
			
			if (count == null)
			{
				map.put(i, 1);
			}
			else {
				map.put(i, ++count);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for (Entry<Integer, Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.printf("Duplicate element from array :%s no. of duplicates present :%d ", entry.getKey(), entry.getValue());
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Time Complexity 0(n) and space complexity 0(n)
		//duplicate(arr);
		duplicate2(arr);
		
	}

}
