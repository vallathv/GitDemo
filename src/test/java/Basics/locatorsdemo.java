package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//id
		
		boolean status =driver.findElement(By.id("nav-logo")).isDisplayed();
		System.out.println(status);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mac");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//linktext /partial Linktest
		
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		driver.findElement(By.partialLinkText("Amazon")).click();
		
		//tagname
		List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement>images =driver.findElements(By.tagName("img"));
		System.out.println(images.size());
	}
	}


