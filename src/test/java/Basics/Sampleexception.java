package Basics;

public class Sampleexception {

	public static void main(String[] args) {
		
	  int a=5;
	  int b=0;
		try {
		 int result =a%b;
		System.out.println("Result :" +result);
		}catch (ArithmeticException  e) {
			
			 System.out.println("Arithmetic Exception caught: Cannot divide by zero.");
		}
		finally {
			
			System.out.println("This block is executed regardless of an exception occurring.");
		}

}
}