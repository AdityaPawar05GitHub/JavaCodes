package pack;

import java.util.Scanner;

class DigitMul
{
	 public int mulDigits(int n) {
		    int product = 1;
		    while (n > 0) {
		      int digit = n % 10;
		      product *= digit;
		    }
		    return product;
		  }
}

public class MultiplyDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    DigitMul obj = new DigitMul();
    int result = obj.mulDigits(num);
    System.out.println(result);
  }
}
