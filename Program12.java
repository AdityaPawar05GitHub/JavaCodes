package pack;
import java.util.*;

class stringDemo5
{
	public String strPallindrome(String s) 
	{
		String tStr = "";
		
		for(int i = 0 ; i < s.length(); i++)
		{
			char sc = s.charAt(i);
			
			tStr = sc + tStr;
			
		}
		return tStr;
		
	}
}

public class Program12 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String str1 = sobj.nextLine();
		
		stringDemo5 obj = new stringDemo5();
		String result = obj.strPallindrome(str1);
		
		if(str1.equals(result))
		{
			System.out.println("String is Pallindrome");
			
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
		
		
	}
	
	

}
