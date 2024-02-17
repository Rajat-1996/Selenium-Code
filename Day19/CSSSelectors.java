package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectors {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//CSS with Tag & ID
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		
		//OR
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("I Phone");
		
		//Tag Class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook")
		
		//Tag & Attribute
		// driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");
		
		//Tag Class & Attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		

	} 

}
