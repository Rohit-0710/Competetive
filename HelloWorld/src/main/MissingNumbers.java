package main;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;


public class MissingNumbers {

	public static int Number(int count)
	{
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<=count-1; i++)
		{
		a.add(i);
		}
		
		return (count*(count +1))/2 ;
		
	}
	
//	public static int getMissingNumber() {
//		
//		//List<Integer> a = new ArrayList<Integer>(1 ,2 ,3 ,4, 5);
//		int[] numbers = {1 ,2 ,3 ,4, 6};
//		
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		int[] numbers = {1 ,2 ,3 ,4, 6, 10 , 8};
//		int count = 6;
//		int expectedSum = (count*(count +1))/2;
//		int actualSum = 0;
//		for (int i: numbers)
//		{
//			actualSum = actualSum + i;
//		}
		
		BitSet bitset = new BitSet();
		for (int i: numbers)
		{
		bitset.set(i-1);
		}
		 int number =0;
		 List<Integer> a = new ArrayList<Integer>();
		for (int i=0; i< count- numbers.length; i++)
		{
		number = bitset.nextClearBit(number);
		
//		System.out.println("Missing numbers index are" + number);
//		System.out.println("Numbers missing are " + ++number);
		a.add(++number);
		}
	//	System.out.println(expectedSum - actualSum);
System.out.println(a);
	}

}
