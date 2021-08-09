package LoginPage;

public class TryCatch {
	
	public static void main(String[ ] args) {
		
	try {
		
		int[] myNumbers = {1, 2, 3};
	    System.out.println(myNumbers[5]); 
	}

	catch(Exception e) {
		
		System.out.println("Somethimg wents wrong");
	}
	
	finally {
		
	    System.out.println("9"); 
	}
}

}