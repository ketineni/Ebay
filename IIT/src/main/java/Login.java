import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
 
		
   
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 

	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//button[@title='Allow All Cookies']")).click();
	 driver.findElement(By.linkText("Create New Account")).click();
	 

	
	
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("Suma");
		driver.findElement(By.name("lastname")).sendKeys("ZEE");
		driver.findElement(By.name("reg_email__")).sendKeys("0789222231");
		driver.findElement(By.name("reg_passwd__")).sendKeys("NewPassword123");
		WebElement drop = driver.findElement(By.id("day"));
		
		Select s = new Select(drop);
		
		s.selectByValue("20");
		
      WebElement d = driver.findElement(By.id("month"));
		
		Select s1 = new Select(d);
		
		s1.selectByValue("3");
		
		 WebElement d1 = driver.findElement(By.id("year"));
		 		
			
			Select s2 = new Select(d1);
			
			s2.selectByValue("1999");
			
		
			
		
		
		
	}
}
