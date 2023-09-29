package pack;
import java.util.*;

class stringDemo2
{
	public int countSmall(String s)
	{
		int iCnt=0;
		
		for(int i = 0; i< s.length(); i++)
		{
			if((s.charAt(i)>='a') && (s.charAt(i)<='z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

public class Program2 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String str = sobj.nextLine();
		
		stringDemo2 obj = new stringDemo2();
		int iRet = obj.countSmall(str);
		
		System.out.println(iRet);
		
	}

}
