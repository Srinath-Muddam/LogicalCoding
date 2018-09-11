package FibonacciSeries;

import java.util.Scanner;

public class FibonacciUsingRecursion 
{
	int i=1;
	int a=0;
	int b=1;
	public void fibonacci(int number)
	{
				
		if(i==1)
		{
		System.out.println(a);
		}
		if(i==2)
		{
		System.out.println(b);
		}
		if(i>2)
		{
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
		i++;
		if(i>number)
		{
		return;
		}
		fibonacci(number);
	    }
	

	public static void main(String[] args) 
	{
		
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number upto which you want to print fibonacci series:");
	int number=s.nextInt();
	FibonacciUsingRecursion fibonacciUsingRecursion=new FibonacciUsingRecursion();
	fibonacciUsingRecursion.fibonacci(number);
	System.out.println("done");
	}

}
