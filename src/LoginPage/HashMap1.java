package LoginPage;
import java.util.HashMap; 

public class HashMap1 {

	public static void main(String[] args) {
		    // Create a HashMap object called capitalCities
		    HashMap<String, String> capitalCities = new HashMap<String, String>();

		    // Add keys and values (Country, City)
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
		    
//		    To access a value in the HashMap, use the get() method and refer to its key:
		    capitalCities.get("England");
		    System.out.println(capitalCities.get("England"));
		    
//		    To remove an item, use the remove() method and refer to the key:
		    capitalCities.remove("England");
		    System.out.println(capitalCities);

//         To remove all items, use the clear() method:
		    capitalCities.clear();
		    System.out.println(capitalCities);
		    
//		    To find out how many items there are, use the size() method:
		    capitalCities.size();
		    System.out.println(capitalCities.size());
		    
		    

		  
		  }
		}	
		
		
		
		
		
		



