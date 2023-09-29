package pack;
import java.util.*;

class stringDemo3
{
	public int countVowels(String s)
	{
		int iCnt = 0;
		
		s= s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++)
		{
			if((s.charAt(i)=='a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

public class Program3 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a string  : ");
		String str = sobj.nextLine();
		
		stringDemo3 obj = new stringDemo3();
		int iRet = obj.countVowels(str);
		
		System.out.println(iRet);
		
	}

}
