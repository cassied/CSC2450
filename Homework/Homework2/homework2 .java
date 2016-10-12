
import java.util.*;


	public static void main(String[] args)
	     //TODO Auto-generated method stub
	
	
	 
	public static int findMaxint(int n1, int n2, int n3){
	    return Math.max(Math.max(n1, n2), n3);
	}


	public static double findMaxdoub(double n4, double n5, double n6);{
	    return Math.max(Math.max(n4, n5), n6);
	}

	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("To input integers, enter 1");
		System.out.println("To input doubles, enter 2");
		int input = sc.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Enter a integer ");
			int n1 = sc.nextInt();
			System.out.println("Enter another integer");
			int n2 = sc.nextInt();
			System.out.println("Enter another integer");
			int n3 = sc.nextInt();
			System.out.println("The largest integer is"+findMaxNum(n1,n2,n3));
		
		case 2:
			System.out.println("Enter a double");
			double n4 = sc.nextDouble();
			System.out.println("Enter another double");
			double n5 = sc.nextDouble();
			System.out.println("Enter the last double");
			double n6 = sc.nextDouble();
			System.out.println("The Largest double is"+findMaxNum(n4,n5,n6));
			 
		}
		
		sc.close();
	}
	
	



}