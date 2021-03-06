package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelPresent {

	public static boolean vowel(String a) {

		boolean check = false;

		if (a.toLowerCase().matches(".*[aeiou].*")) {
			check = true;
		}

		return check;

	}

	public static void main(String args[]) throws IOException {
		
		
		long Start = System.currentTimeMillis();
		vowel("Hello");
		long End = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(vowel(br.readLine()));
		
		System.out.printf("Time taken %d", (End - Start));
	}

}
