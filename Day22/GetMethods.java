package Day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        System.out.println("Title of the page:"+driver.getTitle());
        System.out.println("Current URL:"+ driver.getCurrentUrl());
        
        System.out.println("Page source...........");
        String ps=driver.getPageSource();
        System.out.println(ps);
        System.out.println(ps.contains("html"));
        
        //System.out.println(driver.getWindowHandle());  //4A0F33791D37BBC199B3EEB1B6B57BA0  -Every time new CDWindow
        
        Thread.sleep(3000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //opens new browser window
        
        Set<String> windowids=driver.getWindowHandles();
        for(String winid:windowids)
        {
        	System.out.println(winid);       //F4BBDEB3E48BFDD73DCEE568935E4359
        	                                 //0D6FAC8E28811B6D1533FE46F1053781
        	
        	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        }
        
	}

}
