import java.time.Duration;
import java.util.ArrayList;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SnapDealDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");	
		
		WebElement w1=driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions act=new Actions(driver);
		act.moveToElement(w1).perform();

		driver.findElement(By.linkText("Headphones")).click();
		driver.findElement(By.xpath("//p[starts-with(@title,'boAt Rockerz')]")).click();
		
		Thread.sleep(5000);
		
		ArrayList<String> lst =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		
		
		driver.findElement(By.xpath("//div[text()='Allow All']")).click();
		
        driver.findElement(By.xpath("//span[text()='buy now']")).click();
        
      
		
        
		driver.quit();

		

		 
		
	}

}