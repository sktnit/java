package demo;
import java.io.*;
public class FileI_O_Stream {
	public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;
      //while(true) {
    	  try {
    		  in = new FileInputStream("C:\\Users\\HP\\eclipse-java-workspace\\FileI_O_Stream\\src\\demo\\input.txt");
    		  out = new FileOutputStream("C:\\Users\\HP\\eclipse-java-workspace\\FileI_O_Stream\\src\\demo\\output.txt");
         
    		  int c;
    		  while ((c = in.read()) != -1) {
    			  out.write(c);
    		  }
    	  }finally {
    		  if (in != null) {
   				  in.close();
    		  }
    		  if (out != null) {
    			  out.close();
   			  }
   		  }
    //	}
    }
}