package main;

import java.util.ArrayList;
import java.util.List;

public class PrimeSum {
	
	public static void main(String[] args) {
	//	int A = 1048574;
		int A =4;
		List<Integer> list = new ArrayList<>();
        for (int num = 2; num <= A; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
            {
                list.add(num);
            }
                
        }

        int[] B = new int[2];

        int k=0;
        int i=0;
        while(i<list.size())
        {
            if(list.contains(A - list.get(i)))
            {
                B[0] = list.get(i);
                B[1] = A - list.get(i);
            }
            i++;
        }
        
        System.out.println(B[0] + "  " + B[1]);
	}

}
