package pack;

import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;  

public class Program425 
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String str = sobj.nextLine();
		
		String Arr[] = str.split(" ");
		
		System.out.println("Number of words arr : "+Arr.length);
	}

}
