package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReversal {

	public static String reverse(String in)

	{
		/* Not Working
		 * 
		 * 
		 * if (in == null) throw new
		 * IllegalArgumentException("Input String Length should be greater than 0");
		 */
		
		
		char[] chars = in.toCharArray();
		StringBuilder out = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			out.append(chars[i]);
		}
		System.out.println(in);
		return out.toString();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(reverse(br.readLine()));
	}

}
