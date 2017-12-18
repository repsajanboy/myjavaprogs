import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		String filename = "out.txt";
		try{
			PrintWriter outputStream = new PrintWriter(filename);
			outputStream.println("hi there!");
			outputStream.flush();
			System.out.println("Done.");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
}