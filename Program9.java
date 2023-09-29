package pack;
import java.util.*;

class numberDemo2
{
	public int firstOcc(int iArr[] , int iNo)
	{
		for(int i = 0; i < iArr.length; i++)
		{
			if(iArr[i] == iNo)
			{
				return i;
			}
		}
		return -1;
	}
}

public class Program9 
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter the elements of array : ");
		for(int i = 0; i < iSize; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		System.out.println("Elements of Array : ");
		for(int i = 0 ; i < iSize ; i++ )
		{
			System.out.print(Arr[i] + " ");
		}
		
		System.out.println("Enter element to find occurence : ");
		int iOcc = sobj.nextInt();
		
		numberDemo2 obj = new numberDemo2();
		int iRet = obj.firstOcc(Arr, iOcc);
		
		if(iRet != -1)
		{
			System.out.println("First occurence of that element is : "+ iRet);
		}
		else
		{
			System.out.println("Element not found");
		}
		
		
		
	}

}
