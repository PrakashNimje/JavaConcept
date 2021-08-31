package JavaConcept;

public class Methods {
	
//		  static void myMethod() {
//			  System.out.println("I just got executed!");
//			  
//		  }
//		  
//		  public static void main(String[] args) {
//          myMethod();
//          myMethod();
//          myMethod();
//          myMethod();
//          
//		}
//	
//}
	
//	static void myMethod(String fname) {
//	System.out.println(fname + " Refsnes");
//}
//
// public static void main(String[] args) {
//  myMethod("Liam");
//  myMethod("Jenny");
//  myMethod("Anja");
// }
//}
	
	
//Liam Refsnes
//Jenny Refsnes
//Anja Refsnes
	
	
//	  static void myMethod(int myNum , String fname) {
//	    System.out.println(myNum + fname + " Refsnes");
//	  }
//
//	  public static void main(String[] args) {
//	    myMethod(1,"prakash");
//	    myMethod(2 ,"Nimje");
//	    myMethod(3,"Deepak");
//	  }
//	}
//	

//	  static void myMethod(String fname, int age) {
//	    System.out.println(fname + " is " + age);
//	  }
//
//	  public static void main(String[] args) {
//	    myMethod("Liam", 5);
//	    myMethod("Jenny", 8);
//	    myMethod("Anja", 31);
//	  }
//	}

	// Liam is 5
	// Jenny is 8
	// Anja is 31



	  static int myMethod(int x) {
	    return 5 + x;
	  }

	  public static void main(String[] args) {
	    System.out.println(myMethod(3));
	  }
	}

	// Outputs 8 =(5 + 3)