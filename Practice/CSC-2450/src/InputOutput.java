import java.util.*; 

public class InputOutput {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("Type a double-type number:");
		while (!sc.hasNextDouble())
		{
		    System.out.println("Invalid input\n Type the double-type number:");
		    sc.next();
		}
		double userInput = sc.nextDouble();    // need to check the data type?
		System.out.println("Here it is: " + userInput);
		sc.close();
	}
}
