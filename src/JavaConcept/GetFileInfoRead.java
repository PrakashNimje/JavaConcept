package JavaConcept;

import java.io.File;

public class GetFileInfoRead {

	public static void main(String[] args) {
		
		    File myObj = new File("C:/Prakash/MyName/Prakash.txt");
		    if (myObj.exists()) {
		      System.out.println("File name: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("Writeable: " + myObj.canWrite());
		      System.out.println("Readable " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		
		
		
	}

}
