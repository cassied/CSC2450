
	import java.util.*;
	public class HW2Problem2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub	
				Scanner sc=new Scanner(System.in); 
				System.out.print("What type of number do you want to enter (int or double)?"); 
				String userInput=sc.next(); 
				String userInput2=userInput.toLowerCase(); 
				System.out.print("Enter a number: ");
				String n1=sc.next(); 
				System.out.print("Enter another number: ");
				String n2=sc.next(); 
				System.out.print("Enter a third number: "); 
				String n3=sc.next(); 
				sc.close();
				if (userInput2.equals("int")){
					int x1=Integer.parseInt(n1); 
					int x2=Integer.parseInt(n2); 
					int x3=Integer.parseInt(n3); 
					int x4=maxFunction(x1, x2, x3); 
					System.out.println("Maximum Value = "+x4); 
				}
				if (userInput2.equals("double")){
					double y1=Double.parseDouble(n1); 
					double y2=Double.parseDouble(n2); 
					double y3=Double.parseDouble(n3); 
					double y4=maxFunction(y1, y2, y3); 
					System.out.println("Maximum Value= "+ y4); 
				}
				}
		public static int maxFunction(int a, int b, int c){
				int max=0; 
				if ((a>b && a>c)||(a==b && a>c)||(a==c && a>b)||(a==b && a==c))max=a; 
				if ((b>c && b>a)||(b==c && b>a))max=b; 
				if (c>a && c>b)max=c;    
				return max;
		}
			public static double maxFunction(double a, double b, double c){
				double max=0; 
				if ((a>b && a>c)||(a==b && a>c)||(a==c && a>b)||(a==b && a==c))max=a; 
				if ((b>c && b>a)||(b==c && b>a))max=b; 
				if (c>a && c>b)max=c;  
				return max;
			}
	}

