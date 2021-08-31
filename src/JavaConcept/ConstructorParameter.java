package JavaConcept;

public class ConstructorParameter {


			  int modelYear;
			  String modelName;

			  public ConstructorParameter(int year, String name) {
			    modelYear = year;
			    modelName = name;
			  }

			  public static void main(String[] args) {
				  ConstructorParameter myCar = new ConstructorParameter(1969, "Mustang");				  
				  ConstructorParameter myCar1 = new ConstructorParameter(1995, "Prakash");
			    System.out.println(myCar.modelYear + " " + myCar.modelName);
			    System.out.println(myCar1.modelYear + " " + myCar1.modelName);
			  
}
}
