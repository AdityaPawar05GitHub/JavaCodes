package pack;
import java.util.*;

class stringDemo4
{
	public String reverseString(String s)
	{
		String Rstr = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char sc = s.charAt(i);
			
			Rstr = sc+Rstr;
		}
		return Rstr;
	}
	
}

public class Program4 {
	public static void main(String ags[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sobj.nextLine();
		
		stringDemo4 obj = new stringDemo4();
		String Sret = obj.reverseString(str);
		
		System.out.println(Sret);
		
		
	}

}
