import java.io.*;
import java.util.*;

public class StudentRollCall {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int userInput;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		 	System.out.println("What would you like to do?");
		 	System.out.println("Press 1: Take Roll Call");
		 	System.out.println("Press 2: Add a student");
		 	System.out.println("Press 3: Exit");
		 	userInput = scanner.nextInt();
		 	
		 	switch(userInput) {
			 	case 1: 
				 	takeRollCall();
			 		break;
			 	case 2: 
				 	addStudent();
				 	System.out.println("Student Added");
			 		break;
		 	}

		 	System.out.println("");
		} while(userInput == 1 || userInput == 2);
		
		scanner.close();
	}
	
	public static void addStudent() throws FileNotFoundException {
		
		
 		System.out.println("Enter Student's ID:");
	 	String id = scanner.nextLine();
	 	System.out.println("Enter Student's Name:");
	 	String name = scanner.nextLine();
	 	System.out.println("Enter Student's Rank:");
	 	String rank = scanner.nextLine();
	 	
		PrintStream ps = new PrintStream(new FileOutputStream("rollcall.txt", true));
 		
	 	ps.println(id + ", " + name + ", " +rank);
	 	ps.flush();
	 	ps.close();
	}
	
	public static void takeRollCall() throws FileNotFoundException {
		File file = new File( "rollcall.txt" );
				
		if (file.exists()) {
			Scanner inFile = new Scanner( file );
	
			while ( inFile.hasNext()) {
				String line = inFile.nextLine();
				System.out.println(line);
			}
			inFile.close();
		}
	}

}
