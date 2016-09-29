import java.io.*;

public class FileOutput {

	public static void main(String[] args) 
			throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("out.txt", true));
        
        for(int i = 0; i < 5; i++ ) {
        	ps.println( "New Line!!");
        }
        
        ps.flush();

        ps.close();

	}

}

			
			
			
			
			