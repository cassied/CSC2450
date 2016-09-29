import java.util.*;

public class InputMax {
	public static void main(String[] args) {
		int intMax;
		double doubleMax;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter input type: integer or double ");
		String inputType = s.next();
		s.close();
		switch(inputType) {
			case "integer":
				System.out.print("Enter first number: ");
			    int a = s.nextInt();
			    System.out.print("Enter second number: ");
			    int b = s.nextInt();
			    System.out.print("Enter third number: ");
			    int c = s.nextInt();
			    intMax = max3(a, b, c);
				System.out.println("Maximum Value = " + intMax);	 
			    
	            break;
	            
			case "double":
				System.out.print("Enter first number: ");
				double d = s.nextDouble();
			    System.out.print("Enter second number: ");
			    double e = s.nextDouble();
			    System.out.print("Enter third number: ");
			    double f = s.nextDouble();
			    doubleMax = max3(d, e, f);
				System.out.println("Maximum Value = " + doubleMax);	
			    break;
			default:
	             System.out.println("Invalid input type. Please enter integer or double");
		}
	}
	public static int max3 (int a, int b, int c) {
	   int max = a;
	   if (b > max) max = b;
	   if (c > max) max = c;
	   return max;
	}
	
	public static double max3 (double a, double b, double c) {
	   double max = a;
	   if (b > max) max = b;
	   if (c > max) max = c;
	   return max;
	}
	
}
