package Test2;

public class polyoverloadSample {
	int a=10;
	int b=20;
	
	public void sum()
	{
		
		System.out.println(a+b);
		
	}	
	
	
	public void sum(int x, int y)
	{
		System.out.println(x+y);
		
		
	}	
	
	
	public void sum(double x, int y)
	{
		
		System.out.println(x+y);
		
	}	
	
	public void sum(int x, double y)
	
	{
		
		System.out.println(x+y);
		
		
	}	
	
	public void sum(int a, int b, int c) {
		System.out.println(a-b+c);
		
	}
	
}	
