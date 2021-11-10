package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.nio.Buffer;

public class StringReversal {
	
	public static String StringReverse(String reverse) {
			char[] character = reverse.toCharArray();
			StringBuilder out = new StringBuilder();
			
			for(int i=character.length - 1; i>=0; i--  ) 
			{
				out.append(character[i]);
			}
			System.out.println(character);
		return out.toString();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringReverse(br.readLine());
		System.out.println(StringReverse(br.readLine()));

	}

}
