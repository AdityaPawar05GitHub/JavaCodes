package pack;
import java.util.*;

class numberDemo1
{
	public int countEven(int n)
	{
		int iCnt = 0;
		
		while(n>0) {
			int n1 = n%10;
			if(n1 % 2 != 0)
			{
				iCnt++;
			}
			n = n/10;
		}
		return iCnt;
		
	}
}


public class Program7 
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num1 = sobj.nextInt();
		
		numberDemo1 obj = new numberDemo1();
		
		int iRet = obj.countEven(num1);
		
		System.out.println(iRet);
		
		
	}

}
