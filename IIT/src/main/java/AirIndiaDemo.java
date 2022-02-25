import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AirIndiaDemo {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.airindia.in/");
	    
	       Thread.sleep(3000);
	      
	  
		
	     WebElement et =  driver.findElement(By.xpath("//input[@value='OneWay']"));
	 	Actions ac = new Actions(driver);
		ac.moveToElement(et).click().perform();
		
		
		
		Thread.sleep(3000);


		  WebElement el = driver.findElement(By.xpath("//input[@id='from']"));
	      el.sendKeys("Hyderabad");
	      el.sendKeys(Keys.ARROW_DOWN);
	      el.sendKeys(Keys.ENTER);
	      
	      WebElement to = driver.findElement(By.xpath("//*[@id='to']"));
	      to.sendKeys("London");
	      to.sendKeys(Keys.ARROW_DOWN);
	      to.sendKeys(Keys.ENTER);
	      
	      Select drop = new Select(driver.findElement(By.id("ddladult1")));
	      
	      drop.selectByIndex(2);
	      
         Select dp = new Select(driver.findElement(By.id("ddlchildren1")));
	      
	      dp.selectByIndex(1);
	      
	      
	      
	      
	      
	      	
		
	}

	

}
