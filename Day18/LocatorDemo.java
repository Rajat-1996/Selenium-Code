package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class LocatorDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); //maximize browser window
		
		//search box 
		driver.findElement(By.id("search_query_top")).sendKeys("Macbook");
		
		//search button
		driver.findElement(By.name("submit_search")).click();
	
		//link test & partial linktest
		//driver.findElement(By.linkText("Usha Room Heater")).click();
		driver.findElement(By.partialLinkText("Apple Mackbook")).click();
  
		driver.quit();
	}

}
