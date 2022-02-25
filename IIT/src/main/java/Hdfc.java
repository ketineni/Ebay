import java.time.Duration;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      
	      driver.get("https://www.hdfcbank.com/");
	      
	      driver.findElement(By.xpath("//div[@id='nvpush_cross']")).click();
	      driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn hide-in-mobileApp ng-scope']")).click();
	 
	      driver.findElement(By.xpath("//a[text()='Login']")).click();
	     List<WebElement> lts = driver.findElements(By.xpath("//a[text()='CONTINUE TO THE NEW LOGIN PAGE FOR NETBANKING']"));
	     
	     lts.get(1).click();
	     
	     driver.switchTo().frame("login_page");
	     
	    // driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("23465423");
	     
	    // driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	 	
	     Thread.sleep(1000);
	   
	     Alert at = driver.switchTo().alert();
	   
	     System.out.println(at.getText());
	     at.accept();
	      	
	      
	}
	
}
