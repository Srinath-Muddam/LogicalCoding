package Reverse;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args)
	{
	Scanner s=new  Scanner(System.in);
	System.out.println("Enter number");

	int number=s.nextInt();
	
	
	while(number!=0)
	{
		
		int rev=number%10;
		number=number/10;
		System.out.print(rev);
		
		
	}
	
	
	}

}
