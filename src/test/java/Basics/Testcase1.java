package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	
	/*tc
	1. launch browser
	2.open url
	3.validate title should be Your store
	4. close browser
	*/
	
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/"); 
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		String u=driver.getCurrentUrl();
		System.out.println(u);
		String act_title = driver.getTitle();
	
		System.out.println(act_title);
		if (act_title.equals("Your store")) {
			
			System.out.println("Testpassed");
		}else {
			
			System.out.println("Test failed");
			
		}
		driver.close();
		
		
		
		
		
	}

}
