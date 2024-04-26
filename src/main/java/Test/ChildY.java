package Test;

public class ChildY extends heirarchyclassA {
	
	
	
	int c;
	int d;
	
	void add() {
		System.out.println(c+d);
		
		
		
		
	}
	

	public static void main (String [] args) {
		ChildY yobj= new ChildY();
	
		yobj.c=10;
		yobj.d=9;
		yobj.add();
	
		yobj.a=2;
		yobj.display();
		ChildX xobj= new ChildX();
		xobj.b=3;
		xobj.print();
		
		
		
		
		
		
	}
}
