package Day17;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
1) Launch Browser
2) Open URL
   https://opensource-demo.orangehrmlive.com/
3) Provide UserName-Admin
4) Provide Password-admin123
5) Click On Login Button
6) Verify the Title of Dashboard Page
   Exp Title:-OrangeHRM
7) Close Browser
*/

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win64\\chromedriver.exe");
		
		//WebDriverManager.edgedriver().setup();
		
		//1)Launch Browser
		//EdgeDriver driver=new EdgeDriver(); 
		WebDriver driver=new ChromeDriver();
        
		//2)Open URL on the Browser
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		driver.manage().window().maximize();		
	    //Thread.sleep(500); 
		
		//3) Provide UserName-Admin
		driver.findElement(By.name("Username")).sendKeys("Admin");
		
		//4) Provide Password-admin123 
		driver.findElement(By.name("Password")).sendKeys("admin123");
		
		//5) Click on Submit button 
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				Thread.sleep(7000);
				
				//6) Verify the title of dashboard page   
				//Title validation
				/*String act_title=driver.getTitle();
				String exp_title="OrangeHRM";
				
				if(act_title.equals(exp_title))
				{
					System.out.println("Test passed");
				}
				else
				{
					System.out.println("failed");
				}
				*/
				
				// Lable validation after successful login
				String act_label = "";
				try
				{
				act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
				}
				catch(NoSuchElementException e)	{ 
					}
				
				String exp_label="Dashboard";
				
				if(act_label.equals(exp_label))
				{
					System.out.println("test passed");
				}
				else
				{
					System.out.println("test failed");
				}
				
				//7) close browser
				//driver.close();
				driver.quit(); 
				
	}
				

}
