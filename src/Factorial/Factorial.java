package Factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int fact=1;
	int number=s.nextInt();
	for(int i=1;i<=number;i++)
	{
	fact=fact*i;
	}
	System.out.println("factorial of "+number+" is "+fact);

	}

}
