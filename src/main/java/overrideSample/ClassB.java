package overrideSample;

public class ClassB extends ClassA {
	
	
	
	void m1() {
		
		System.out.println("child class");
		
	}
	
	
	
	double rateOfInterest() {
		return 10;
	}
	public static void main(String[] args) {
	
		ClassB objb= new ClassB() ;
		objb.m1();
		System.out.println(objb.rateOfInterest());
		
			
			
			
	
	}

}
