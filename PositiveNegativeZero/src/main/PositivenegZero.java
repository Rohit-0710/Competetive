package main;


public class PositivenegZero {

	public static void checkNum(double a){
		
//		Scanner sc = new Scanner(System.in);
//		if(a == 0)
//		{
//			System.out.println("Zero");
//		}
//		else if (a > 0) {
//			System.out.println("Positive");
//		}
//		else if (a < 0) {
//			System.out.println("negative");
//		}
		
		if(a > 0)
		{
		
		System.out.println(a + " Km/h = " + (long)(a*5/18) + " mi/h") ;
		}
		else {
		System.out.println( -1);
		}
	}
	
	public static void main(String[] args)
	{
		checkNum(10.14);
		checkNum(-9.98);
		checkNum(0);
	}
}
