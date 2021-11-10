package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOrNot {
	
	public static boolean PrimeCheck(int a)
	{
	
		for (int i=2; i<a/2; i++)
		{
			if(a%i == 0)
			{
				return false;
			}
			
		}
		
		return true;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(PrimeCheck(Integer.parseInt(br.readLine())));
		
	}

}
