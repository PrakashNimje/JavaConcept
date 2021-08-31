package JavaConcept;

public class MultiDAarry {

	public static void main(String[] args) {

//      Multidimensional Arrays
        
      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 0}, {8,9,10,11,12} };
      
//      myNumbers is now an array with two arrays as its elements.

//      To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. 
//      This example accesses the third element (2) in the second array (1) of myNumbers:
      
      int x = myNumbers[1][0];
      System.out.println(x); 
		
//      We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
		
		
//      for (int i = 0; i < myNumbers.length; ++i) {
//          for(int j = 0; j < myNumbers[i].length; ++j) {
//            System.out.println(myNumbers[i][j]);
//          }
        }
		
	}


