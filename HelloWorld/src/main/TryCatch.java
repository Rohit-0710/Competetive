package main;

public class TryCatch {

	public static void main(String[] args) {
		//call();
		//ans();
		hi();
	}

	private static void hi() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++)
		{
			
			if(i == 5)
			{
				break;
			}
			System.out.println(i);
		}
		
	}

	private static void ans() {
		// TODO Auto-generated method stub
		
		String A = "A  B";
		String[] B = A.split(" ");
		
		String C = "";
		
		for(int i=0; i<B.length; i++)
		{
			if(!B[i].isEmpty())
			{
			C = C+ B[i] + " ";
			}
		}
		
		System.out.println(C);
	}

	private static void call() {
		// TODO Auto-generated method stub
		int y=0;
		for(int i=0; i<5; i++)
		{
			try {
				y = i/i;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception called");
				//y=0;
			}
			
			System.out.println("after try/catch - "+ y);
		}
	}
}
