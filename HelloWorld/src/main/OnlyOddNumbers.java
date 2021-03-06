package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyOddNumbers {
	
	public static void odd(List<Integer> list) {
		
		
		if (list.parallelStream().anyMatch(x -> x % 2 == 0))
		{
			System.out.println("Odd Numbers are not there");
		}
		
		else {
			System.out.println("Only Odd Numbers are there");
		}
		
		
	}
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		 for(int i : list)
		 {
			 if (i%2 == 0)
			 {
				 return false;
			 }
		 }
		 return true;
	}

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i =0; i<=5; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Size of list is "+ list.size());
		odd(list);
		System.out.println(onlyOddNumbers(list));

	}

}
