package pack;
import java.util.*;

public class Program10 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str1 = sobj.nextLine();
		
		System.out.println("Enter second string : ");
		String str2 = sobj.nextLine();
		
		System.out.println("Enter the value for N : ");
		int N = sobj.nextInt();
		
		if(N > str2.length())
		{
			System.out.println(str1+str2);
		}
		else
		{
			
		}
		
	}

}
