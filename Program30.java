package pack;
import java.util.*;

public class Program30 
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
			
		System.out.println("Enter the number no elements : ");
		int iSize = sobj.nextInt();
			
			
		int Arr[] = new int[iSize];
		System.out.println("Enter the elements of Array : ");
		for(int i = 0 ; i < iSize; i++)
		{
			Arr[i] = sobj.nextInt();
		}
			
		System.out.println("Elements of Array are :");
		for(int i = 0; i <iSize; i++)
		{
			System.out.print(Arr[i]+" ");
		}
		
		int max = Arr[0];
		
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] > max)
			{
				max = Arr[i];
				
			}
		}
		System.out.println("Minimum element of Array is :"+ max);
			
	}

}

