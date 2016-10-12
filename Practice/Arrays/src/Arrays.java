import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String employees [][] = new String[5][];
		Scanner sc = new Scanner(System.in);
		String userInput;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter employee info");
			userInput = sc.nextLine();
			employees[i] = userInput.split("[,]");
		}
		
		for(int j = 0; j < employees.length; j++) {
			for(int n = 0; n < employees[j].length; n++) {
				System.out.println(employees[j][n]);
			}
		}
		
	}

}
