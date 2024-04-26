package MethdOverridvsOverloading;

public class ClassXYZ extends ClassABC {

	public void m1(int a) {

		System.out.println(a * a);

	}

	void m2(int b) {

		System.out.println(b + b);

	}

	void m2(int x, int y) {// overloading

		System.out.println(x + y);

	}

	
	
	
void m3(int i) {
		
		System.out.println (i+2);
		
		
	}
	public static void main(String[] args) {
		ClassXYZ objxyz = new ClassXYZ();
		objxyz.m1();
		objxyz.m2(2);
		objxyz.m2(5, 70);

	}

}
