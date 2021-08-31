package JavaConcept;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
//		To Craete File
		try {
		      File myObj = new File("C:/Prakash/MyName/Prakash.xlsx");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		
	}

