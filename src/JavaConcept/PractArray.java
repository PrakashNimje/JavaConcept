package JavaConcept;

public class PractArray {

	public static void main(String[] args) {

		int [] arr = {1, 45, 67, 98, 455, 678};
		int max = Integer.MIN_VALUE;
		
		for ( int p : arr){
		 if(p>max){
		 max=p;
		 }
		}
		System.out.println("Max elemnt is:"+max);
		
////		MIN
////		public class maxmin {
////		public static void main(String[] args) {
//		int [] arr = {1, 45, 67, 98, 455, 678,-6};
//		int min = Integer.MAX_VALUE;
//		for ( int element : arr){
//		 if(element<min){
//		 min=element;
//		 }
//		}
//		System.out.println(min);
      

      
	}

}
