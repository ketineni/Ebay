import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PepperFry {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://www.pepperfry.com/");
		WebElement el = driver.findElement(By.xpath("//a[@rel='meta-furniture']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(el).build().perform();
		driver.findElement(By.linkText("Seating")).click();
		
		driver.findElement(By.linkText("Benches")).click();
		//driver.switchTo().frame(1);
		List<WebElement> lt = driver.findElements(By.xpath("//h5[@class='clip-maincat-ttl pf-margin-0 font-14']"));
		   System.out.println(lt.size());
		
		 for(int i = 0 ; i < lt.size() ; i++ ) {
        	String st = lt.get(i).getText();
        	 System.out.println(st);
	}

 }
	
}	

