import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File text = new File("read.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(text);
			int T = sc.nextInt();
			while(T>0)
			{
				int n= sc.nextInt();
				int v[] = new int[n];
				int wtr[] = new int[n];
				for (int i = 0; i < v.length; i++)
					v[i] = sc.nextInt();			
				
			
				
				T--;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void printSubArrays(int []arr, int start, int end) 
	{      
	    // Stop if we have reached the end of the array      
	    if (end == arr.length)  
	        return; 
	      
	    // Increment the end point and start from 0  
	    else if (start > end)  
	        printSubArrays(arr, 0, end + 1); 
	          
	    // Print the subarray and increment the starting point  
	    else
	    { 
	   
	        for (int i = start; i < end; i++){ 
	            System.out.print(arr[i]+", "); 
	        } 
	          
	   
	        printSubArrays(arr, start + 1, end); 
	    } 
	      
	    return; 
	} 




}
