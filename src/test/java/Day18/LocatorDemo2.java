package Day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize(); //maximize browser window
		Thread.sleep(5000);
		
		//Finding number of sliders on homepage
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		System.out.println("No. of sliders:"+sliders.size());
		
		//Finding total numbers of images on homepage
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());	
		
		//Find Total number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		driver.quit();
				

	}

}
