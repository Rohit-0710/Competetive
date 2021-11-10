package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  
  
class LinearSearch  
{  
    // This function returns index of element x in arr[]  
    static int search(int arr[], int n, int x)  
    {  
        for (int i = 0; i < n; i++)  
        {  
            // Return the index of the element if the element  
            // is found  
            if (arr[i] == x)  
                return i;  
        }  
  
        // return -1 if the element is not found  
        return -1;  
    }  
  
    public static void main (String[] args) throws IOException 
    {  
        // Note that size of arr[] is considered 100 according to  
        // the constraints mentioned in problem statement.  
        int[] arr = new int[100];  
  
        // Using BufferedReader class to take input  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
          
        int t = Integer.parseInt(br.readLine());  
          
        // String Buffer to store answer 
        StringBuffer sb = new StringBuffer(); 
  
        // One by one run for all input test cases  
        while (t > 0)  
        {  
            // Input the size of the array  
            int n = Integer.parseInt(br.readLine());  
  
            // to read multiple integers line  
            String line = br.readLine();  
            String[] strs = line.trim().split("\\s+");  
              
            // Input the array  
            for (int i = 0; i < n; i++)  
                arr[i] = Integer.parseInt(strs[i]);  
  
            // Input the element to be searched  
            int x = Integer.parseInt(br.readLine());  
  
            // Compute and print result  
            sb.append(search(arr, n, x)+"\n"); 
  
            t--;  
        } 
          
        System.out.print(sb); 
    }  
}  
