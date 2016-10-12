import java.io.*;
import java.util.*;

public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String fileName = scanner.nextLine();
		File file = new File( fileName );
		
		if (file.exists()) {
			Scanner inFile = new Scanner( file );
			int lineNum = 0;
			
			while ( inFile.hasNext()) {
				String line = inFile.nextLine();
				System.out.println(++lineNum + ": " +line);
			}
			inFile.close();
		}
		
		scanner.close();
	}

}
