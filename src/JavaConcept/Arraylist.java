package JavaConcept;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {


		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		
//		ArrayList<Integer> Mynumber = new ArrayList<Integer>(); // Create an ArrayList object
//		Mynumber.add(11);
//		Mynumber.add(12);
//		Mynumber.add(14);
//		Mynumber.add(15);
//		Mynumber.add(10);
		

		//	The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		//    System.out.println(cars);

		//    To access an element in the ArrayList, use the get() method and refer to the index number:

		//		cars.get(0);
		//		System.out.println(cars.get(0));  


		//    To modify an element, use the set() method and refer to the index number:

		//    cars.set(0, "Opel");
		//    System.out.println(cars);

		//    To remove an element, use the remove() method and refer to the index number:

		//    cars.remove(0);
		//    System.out.println(cars);

		//		To remove all the elements in the ArrayList, use the clear() method:

		//		cars.clear();		
		//		System.out.println(cars);

		//		To find out how many elements an ArrayList have, use the size method:

//		cars.size();
//		System.out.println(cars.size());



//		Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
//		for (int i = 0; i < cars.size(); i++) {
//		      System.out.println(cars.get(i));
//		}

// You can also loop through an ArrayList with the for-each loop:
//      Loop Through an Array with For-Each  
//      for (type variable : arrayname) {
//      	  ...
//      	}
      
//      for(String i:cars) {
//      	System.out.println(i);
//      }
		
//      Example 2
		
//      	for(Integer i:Mynumber) {
//          	System.out.println(i);
      
      
//      Sort an ArrayList
//      Another useful class in the java.util package is the Collections class, which include the sort() method 
//       for sorting lists alphabetically or numerically:
		
//		Sort an ArrayList of Strings:


//      
//		Collections.sort(cars);  // Sort cars
//	    for (String i : cars) {
//	      System.out.println(i);
//	    }
//      
      
	    
//	    Sort an ArrayList of Integers:

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);

	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    }
      
    

      }
	

