import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class DataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Text.txt"); // Change this to your file name

		try {
		  Scanner fileReader = new Scanner(file);
		  while (fileReader.hasNext()) {
		    String word = fileReader.next(); 
		    System.out.println(word);
		    //Now you can use the word. By default, Scanner is space-delimited.
		  }
		} catch (IOException e) {
		  // Handle error...
		}
	}

}
