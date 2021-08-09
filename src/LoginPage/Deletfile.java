package LoginPage;

import java.io.File;

public class Deletfile {

	public static void main(String[] args) {

		File myObj = new File("C:/Prakash/MyName/Prakash.java"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
		
	}

}
