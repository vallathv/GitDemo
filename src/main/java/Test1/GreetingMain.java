package Test1;

public class GreetingMain {

	public static void main(String[] args) {
		
		Greetings gr = new Greetings();
		gr.m1();
		String s= gr.m2();
		System.out.println(s);
		
		gr.m3("Varsha");
		
		String j = gr.m4("Manager");
	System.out.println(j);
	}

}
