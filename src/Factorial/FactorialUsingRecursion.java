package Factorial;

import java.util.Scanner;

public class FactorialUsingRecursion {
	int i=1;
	
	int fact=1;
	void fact(int number)
	{
		
		
		fact=fact*i;
		i++;
		if(i>number)
		{
			System.out.println("Factorial of "+number+" is "+fact);
			return;
		}
		fact(number);
	}
	public static void main(String[] args) 
	
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		FactorialUsingRecursion factorialUsingRecursion=new FactorialUsingRecursion();
		factorialUsingRecursion.fact(num);

	}

}
