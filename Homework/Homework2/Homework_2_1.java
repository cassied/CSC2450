import java.io.*;
import java.util.*;

public class Homework_2_1 {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		double p1 = 1.2;
		double p2 = 2.3;
		double p3 = 3.4;
		
		System.out.println(findMax(n1,n2,n3));
		System.out.println(findMax(p1,p3,p2));
		
	}

}

