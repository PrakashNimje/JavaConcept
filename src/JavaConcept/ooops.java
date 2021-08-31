package JavaConcept;

public class ooops {
	
	// Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  static Integer myStaticMethood() {
		
		  int a=10;
		  int b=20;
		  int c=a+b;
		  
		  System.out.println("My Addition is:"+c);
		  return c;
	  }
	  
	  
	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[ ] args) {
	    myStaticMethod(); // Call the static method
	    myStaticMethood();
//	    myPublicMethod(); This would output an error
	    
	    ooops myObj = new ooops(); // Create an object of Main
	    myObj.myPublicMethod(); // Call the public method
	}
}