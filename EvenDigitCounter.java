package pack;

import java.util.Scanner;

class Digit
{
	public int countEvenDigits(int n) {
	    int count = 0;
	    while (n > 0) {
	      int digit = n % 10;
	      if (digit % 2 != 0) {
	        count++;
	      }
	      n /= 10;
	    }
	    return count;
	  }
	
}

public class EvenDigitCounter {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    Digit obj = new Digit();
    
    int Ret = obj.countEvenDigits(number);
    System.out.println(Ret);
  }

  
}
