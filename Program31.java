package pack;
import java.util.*;

public class Program31 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter size of an Array : ");
		int iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		System.out.println("Enter the elements of Array : ");
		for(int i = 0; i < iSize; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		System.out.println("Array is : ");
		for(int i = 0; i < iSize; i++)
		{
			System.out.print(Arr[i]+ " ");
		}
		
		System.out.println("Enter number whose position need to find :");
		int n = sobj.nextInt();
		
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == n)
			{
				System.out.println("The number is present at "+ i);
			}
		}
		
	}

}
