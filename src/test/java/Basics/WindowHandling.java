package Basics;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	
	public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	
	String  parentW=driver.getWindowHandle();
	System.out.println(parentW);
System.out.println(driver.getTitle());
	
WebElement clcikhere= driver.findElement(By.xpath("//div[@class='example']/child::a"));
	
clcikhere.click();
	
		Set<String>mutipleWid=driver.getWindowHandles();
		System.out.println(mutipleWid.size());
		
		
	for (  String id :mutipleWid) {
		
	String title 	= driver.switchTo().window(id).getTitle();
		
		System.out.println(title);
		
	}
	
}
}