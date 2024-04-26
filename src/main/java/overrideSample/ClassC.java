package overrideSample;

public class ClassC extends ClassA{
	
	
	
	void m1() {
		
		System.out.println("child2 class");
		
	}
	
	
	
	double rateOfInterest() {
		return 20;
	}

	public static void main(String[] args) {
		
		ClassC c= new ClassC();
		c.m1();
		double r= c.rateOfInterest();

		System.out.println(r);
		
		ClassB b= new ClassB();
		b.m1();
		System.out.println(b.rateOfInterest());
		
	}

}
