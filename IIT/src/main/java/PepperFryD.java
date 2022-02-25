import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PepperFryD {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		    
			driver.manage().window().maximize();
			driver.get("https://www.pepperfry.com/");
			
			WebElement el = driver.findElement(By.xpath("//a[@rel='meta-sofasrecliners']"));
			Actions act = new Actions(driver);
			act.moveToElement(el).perform();
		    driver.findElement(By.linkText("By Type")).click();
		    driver.findElement(By.xpath("//h2[@class='clipCard__ttl marginBottom8']")).click();
		    
		    //driver.findElement(By.xpath("//a[@class='popup-close']")).click();
		    
		    ArrayList<String> ast = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(ast.get(1));
		    driver.findElement(By.xpath("//a[@class='vip-bn-btn orange-button']")).click();
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//span[@class='ck-proceed-btn-wrap']")).click();
		    
		    driver.findElement(By.id("name")).sendKeys("Sumana");
		    
		    driver.findElement(By.id("mobile")).sendKeys("92371873813");
		    driver.findElement(By.id("street")).sendKeys("London,UnitedKingdom");
		    driver.findElement(By.id("city")).sendKeys("Hyderabad");
		    
		    Select drop = new Select(driver.findElement(By.id("region")));
		    
		    drop.selectByValue("Andhra Pradesh");
		    		    		
		    //driver.quit();	
		    		
		    				   		  		
		    	
			
			

	}

}
