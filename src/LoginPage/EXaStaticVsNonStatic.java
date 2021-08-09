package LoginPage;

public class EXaStaticVsNonStatic {

		// Create a Main class
		public static class Main {
		 
		  // Create a fullThrottle() method
		  public void fullThrottle() {
		    System.out.println("The car is going as fast as it can!");
		  }

		  // Create a speed() method and add a parameter
		  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		  }

		  // Inside main, call the methods on the myCar object
		  
		  public static void main(String[] args) {
		    Main myCar = new Main();   // Create a myCar object
		    myCar.fullThrottle();      // Call the fullThrottle() method
		    myCar.speed(200);          // Call the speed() method
		  }
		}
}

		// The car is going as fast as it can!
		// Max speed is: 200
		
		
		
		
		