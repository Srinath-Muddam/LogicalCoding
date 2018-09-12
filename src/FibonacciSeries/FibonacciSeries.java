package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args)
	{
	
		int a=0;
		int b=1;
		int c;
		System.out.println("enter the limit upto which you want to print fibonacci series");
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	
		
		
		
		
	}

}
