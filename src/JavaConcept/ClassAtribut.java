package JavaConcept;

public class ClassAtribut {

	//	int x=15;
	////	int y;
	//
	//	public static void main(String[] args) {
	//
	//		ClassAtribut myObj = new ClassAtribut();
	//		ClassAtribut myObj2 = new ClassAtribut();
	//		myObj2.x=20;
	//
	//		System.out.println(myObj2.x);
	//		System.out.println(myObj.x);


	String fname = "John";
	String lname = "Doe";
	int age = 24;
	int Boy = 1995;

	public static void main(String[] args) {
		ClassAtribut myObj = new ClassAtribut();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Birth Year is : " + myObj.Boy);

	}
}	


