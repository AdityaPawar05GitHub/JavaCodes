package pack;
import java.util.*;


public class Program5 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of elements in an Array : ");
		int iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		for(int i =0; i < Arr.length; i++)
		{
			System.out.println("Enter the elemets :");
			Arr[i] = sobj.nextInt();
		}
		
		System.out.println("Elements of Array : ");
		
		for(int i =0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]+ " ");
		}
		
		System.out.println();
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 0; i < iSize; i++)
		{
			if(Arr[i] % 2 == 0)
			{
				evenSum = evenSum+Arr[i];
			}
			else
			{
				oddSum = oddSum+Arr[i];
			}
		}
		
		int diff = evenSum - oddSum;
		
		System.out.println("Even sum :" + evenSum);
		System.out.println("Even odd :" + oddSum);
		System.out.println("Difference :" + diff);
		
		
	}

}
