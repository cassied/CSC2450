import java.io.*;
import java.util.*;

public class Homework2 
{
	
	public static int findMax(int x, int y, int z)
	{
		int max = x;
		if (x>y)
		{
			if (x>z)
			{
				max = x;
			}
		}
		else
		{
			if (y>z)
			{
				max = y;
			}
			else 
			{
				max = z;
			}
		}
		return max;
	}
	
	public static double findMax(double a, double b, double c)
	{
		double max = a;
		if (a>b)
		{
			if (a>c)
			{
				max = a;
			}
		}
		else
		{
			if (b>c)
			{
				max = b;
			}
			else 
			{
				max = c;
			}
		}
		return max;
	}
	
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("For integer inputs, enter 1");
		System.out.println("For double inputs, enter 2");
		int input = sc.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Enter a number");
			int x = sc.nextInt();
			System.out.println("Enter another number");
			int y = sc.nextInt();
			System.out.println("Enter the last number");
			int z = sc.nextInt();
			System.out.println("The largest number is " + findMax(x,y,z));
			break;
			
		case 2:
			System.out.println("Enter a number");
			double a = sc.nextDouble();
			System.out.println("Enter another number");
			double b = sc.nextDouble();
			System.out.println("Enter the last number");
			double c = sc.nextDouble();
			System.out.println("The largest number is " + findMax(a,b,c));
			break;
		}
		
		sc.close();
	}
}
