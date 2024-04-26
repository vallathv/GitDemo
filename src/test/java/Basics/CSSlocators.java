package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// tag#id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mac");
		driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute[type='submit']"));
		
		
		//tag classanme  tag.classname

	}

}
