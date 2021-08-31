package JavaConcept;

import java.util.HashSet;

public class set {

	public static void main(String[] args) {

//		1)The HashSet class has many useful methods. For example, to add items to it, use the add() method:
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    
//	    System.out.println(cars);

// 2)To check whether an item exists in a HashSet, use the contains() method:
//	    cars.contains("Mazda");

//	    System.out.println(cars.contains("Mazda"));

// 3)To remove an item, use the remove() method:

//	    cars.remove("Volvo");
//	    System.out.println(cars);
//	    
	    
//	    To remove all items, use the clear() method:
//
//	    cars.clear();
//	    System.out.println(cars);

//	    Loop through the items of an HashSet with a for-each loop:

//	    for (String i : cars) {
//	    	  System.out.println(i);
//	    	}
		
		
//	******************************************************************************************************
	    
//	    Items in an HashSet are actually objects. In the examples above, we created items (objects) of type "String". 
//	    Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent 
//	    wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
//		
//	    Use a HashSet that stores Integer objects:

	 // Create a HashSet object called numbers
	    HashSet<Integer> numbers = new HashSet<Integer>();

	    // Add values to the set
	    numbers.add(4);
	    numbers.add(7);
	    numbers.add(8);

	    // Show which numbers between 1 and 10 are in the set
	    for(int i = 1; i <= 10; i++) {
	      if(numbers.contains(i)) {
	        System.out.println(i + " was found in the set.");
	      } else {
	        System.out.println(i + " was not found in the set.");
	        
	      }
	    }
	    
//	   ****************************************************************************** 
	    
	    
	}

}
