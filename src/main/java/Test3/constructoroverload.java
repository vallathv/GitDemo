package Test3;

public class constructoroverload {
	
	
	double height,width,depth;
	
	
	constructoroverload()
	{
		
		height=width=depth=0;
	}	

	
	constructoroverload(double h, double w, double d)
	{
		height=h;
		width=w;
		depth=d;
		
	
	}	
	
	constructoroverload(double len)
	{
		height=width=depth=len;
	
	}	
	
}
