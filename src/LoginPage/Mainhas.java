package LoginPage;

import java.util.HashMap;

public class Mainhas {

	public static void main(String[] args) {
		

		//		Java HashMap
		//		In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an 
		//		index number (int type). 

		//		A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
		//		One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, 
		//		or the same type, like: String keys and String values:


		//      Eax1:Create a HashMap object called capitalCities that will store String keys and String values:

		//		import java.util.HashMap; // import the HashMap class
		//		HashMap<String, String> capitalCities = new HashMap<String, String>();
//--------------------------------------------------------------------------------------------------
		//		1)Add Items
		//		The HashMap class has many useful methods. For example, to add items to it, use the put() method:
		
		// Create a HashMap object called capitalCities
		

		    HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
//		    System.out.println(capitalCities); 
		    
		    
		    
		  //--------------------------------------------------------------------------------------------------		    

//		    2)To access a value in the HashMap, use the get() method and refer to its key:
//		    
//		    capitalCities.get("England");
//		    System.out.println(capitalCities.get("England"));
		    
		    
		    
			  //--------------------------------------------------------------------------------------------------	
		    
//		    3)To remove an item, use the remove() method and refer to the key:
		    
//		    capitalCities.remove("England");
//		    System.out.println(capitalCities);
		    
		  //--------------------------------------------------------------------------------------------------
		    
		    
//		    4)To remove all items, use the clear() method:

//		    capitalCities.clear();
//		    System.out.println(capitalCities);
		    
//		    To find out how many items there are, use the size() method:

//		    System.out.println(capitalCities.size());
		    
		  //--------------------------------------------------------------------------------------------------		    
//		    Loop Through a HashMap
//		    Loop through the items of a HashMap with a for-each loop.
//		    Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
		    
		 // Print keys
		    for (String i : capitalCities.keySet()) {
		      System.out.println(i);
		    }
		    
		    
		    System.out.println("*****************************************");
		    
		 // Print values
		    for (String i : capitalCities.values()) {
		      System.out.println(i);
		    } 
		    
		    System.out.println("*****************************************");
		    
		 // Print keys and values
		    for (String i : capitalCities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalCities.get(i));
		    }
		    
		    System.out.println("*****************************************");
		    
//		    Other Types
//		    Keys and values in a HashMap are actually objects. In the examples above, we used objects of type "String". 
//		    Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify 
//		    an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, 
//		    Double for double, etc:
		    
//		    1)Create a HashMap object called people that will store String keys and Integer values:
		    
		 // Create a HashMap object called people
		    HashMap<String, Integer> people = new HashMap<String, Integer>();


		    // Add keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Angie", 33);

		    for (String i : people.keySet()) {
		      System.out.println("key: " + i + " value: " + people.get(i));
		    }


		    
		    
	}

}
