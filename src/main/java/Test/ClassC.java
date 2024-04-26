package Test;

public class ClassC extends ClassB {

	
	
	
	int x;
	
	int z;
	
	void print() {
		System.out.println(x+z);
		
		
		
		
	}
	public static void main(String[] args) {
		ClassC objc= new ClassC();
		objc.x=1;
		objc.z=2;
		objc.print();
		objc.display();
		System.out.println(objc.b);
		
		
		

	}

}
