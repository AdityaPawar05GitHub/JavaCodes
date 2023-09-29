package pack;
import java.util.*;

public class Program27 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		System.out.println("Enter the elements of Array : ");
		for(int i = 0; i < iSize; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		System.out.println("Elements of Array : ");
		for(int i = 0; i < iSize; i++)
		{
			System.out.print(Arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Odd elements of array : ");
		for(int i = 0 ; i < Arr.length; i++)
		{
			if(Arr[i] % 2 != 0)
			{
				System.out.println(Arr[i]);
			}
		}

	}
}
