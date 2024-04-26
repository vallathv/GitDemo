package MethdOverridvsOverloading;

public class classsuper extends supersample {

	
	String colour= "black";
	
void animal() {
		
		
		System.out.println(colour);
		//System.out.println(super.colour);
		super.animal();
		
	}
	
	
	public static void main(String[] args) {
		
		classsuper obj= new classsuper();
	System.out.println(obj.colour);
	obj.animal();
		
	}

}
