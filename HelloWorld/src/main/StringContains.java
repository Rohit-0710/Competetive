package main;

public class StringContains {
	
	public static void main(String[] args) {
		System.out.println(test());
	}

	private static boolean test() {
		// TODO Auto-generated method stub
		
		String A = "America is great";
		String B = "is g";
		int i = A.indexOf(B);
		System.out.println(i);
		return A.contains(B);
	}

}
