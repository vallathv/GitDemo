package interafcesample;

public class Interfacedemo implements shape {
	
	public void shape() {
		
		System.out.println( a);
		
	}
	public void add() {
		
		System.out.println(leng+breadth);
		
	}
	
	public void display() {
		
		System.out.println("implemented");
	}
	

	public static void main(String[] args) {

		Interfacedemo i = new Interfacedemo();// object is created for class ,butvariable type is class
		i.add();
		i.shape();
		i.display();
		shape s= new Interfacedemo();// object is created for class, variable type in interface.
		//obj of child class hold the variable of parent class
		s.add();
		//shape d= new shape(); error
		System.out.println(shape.leng);
	}

}
