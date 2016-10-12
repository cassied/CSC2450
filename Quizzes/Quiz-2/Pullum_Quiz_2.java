import java.io.*;
import java.util.*;

public class Pullum_Quiz_2 {

	double r;
	double s;
	double l;
	double w;
	
	public static double circle(double r)
	{
		double area = Math.PI * r * r;
		return area;
	}
	
	public static double square(double s)
	{
		double area = s * s;
		return area;
	}
	
	public static double rectangle(double l, double w)
	{
		double area = l * w;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
			System.out.println("To find the area of a circle, enter 1");
			System.out.println("To find the area of a square, enter 2");
			System.out.println("To find the area of a rectangle, enter 3");
			System.out.println("To quit, enter 4");
			
			int x = sc.nextInt();
			
			do{
			
			switch(x)
			{
			case 1:
				System.out.println("Enter a radius for a circle: ");
				double r = sc.nextDouble();
				System.out.println("The area of the circle is " + circle(r));
				System.out.println();
				System.out.println("To find the area of a circle, enter 1");
				System.out.println("To find the area of a square, enter 2");
				System.out.println("To find the area of a rectangle, enter 3");
				System.out.println("To quit, enter 4");
				x = sc.nextInt();
				break;
				
			case 2:
				System.out.println("Enter a side for a square: ");
				double s = sc.nextDouble();
				System.out.println("The area of the square is " + square(s));
				System.out.println();
				System.out.println("To find the area of a circle, enter 1");
				System.out.println("To find the area of a square, enter 2");
				System.out.println("To find the area of a rectangle, enter 3");
				System.out.println("To quit, enter 4");
				x = sc.nextInt();
				break;
				
			case 3:
				System.out.println("Enter a length to a rectangle: ");
				double l = sc.nextDouble();
				System.out.println("Enter a width to the rectangle: ");
				double w = sc.nextDouble();
				System.out.println("The area of the rectangle is " + rectangle(l,w));
				System.out.println();
				System.out.println("To find the area of a circle, enter 1");
				System.out.println("To find the area of a square, enter 2");
				System.out.println("To find the area of a rectangle, enter 3");
				System.out.println("To quit, enter 4");
				x = sc.nextInt();
				break;
			} 
	} while (x==1 || x==2 || x==3);
		sc.close();
}}
