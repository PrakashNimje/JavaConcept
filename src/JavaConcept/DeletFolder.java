package JavaConcept;

import java.io.File;

public class DeletFolder {

	public static void main(String[] args) {

		File myObj = new File("C:/Prakash/MyName/prakash"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the folder: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the folder.");
	    } 
		
		
	}

}
