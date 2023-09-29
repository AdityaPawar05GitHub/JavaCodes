package pack;
import java.util.*;

public class Program11 
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str1 = sobj.nextLine();
		
		System.out.println("Enter second string : ");
		String str2 = sobj.nextLine();
		
		if(str1.equals(str2))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not matching");
		}
	}
	

}
