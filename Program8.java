package pack;

import java.util.*;

public class Program8
{
	public static void main(String[] args) 
	{
	    Scanner sobj = new Scanner(System.in);
	    
		System.out.println("Enter a number of Elements : ");
		int iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter elements of Array : ");
		for(int i = 0; i < iSize; i++)
		{
		    Arr[i] = sobj.nextInt();
		}
		
		System.out.println("Enter a number to search : ");
		int NO = sobj.nextInt();
		
		boolean found = false;
		for(int  i = 0; i < iSize; i++)
		{
		    if(Arr[i]==NO){
		    found = true;
		    break;}
		}
		
		if(found == true)
		{
		    System.out.println("Element is present ");
		}
		else{
		    System.out.println("Element is not present");
		}
		
	}
}
