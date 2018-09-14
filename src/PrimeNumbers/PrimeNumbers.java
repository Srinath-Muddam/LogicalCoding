package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args)
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number");
	int number=scanner.nextInt();	
	int count=0;
	for(int i=1;i<=number;i++)
	{
		if(number%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("Not a prime number");
	}
		
	}

}
