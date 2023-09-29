package pack;
import java.util.*;

class stringDemo
{
	public int countCapital(String s)
	{
		int iCnt = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if((s.charAt(i) >= 'A') && (s.charAt(i)<= 'Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
		
	}
}

public class Program1 {
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sobj.nextLine();
		
		stringDemo obj = new stringDemo();
	    int iRet = obj.countCapital(str);
	    System.out.println("Number of capital letters : "+iRet);
	}

}
