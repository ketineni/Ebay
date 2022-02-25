import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


 public class Ebay {

		public static void main(String[] args) throws InterruptedException {
		      WebDriverManager.chromedriver().setup();
		      ChromeDriver driver = new ChromeDriver();
		     
	
		       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://www.ebay.co.uk/");
		
      
      
        WebElement el = driver.findElement(By.id("gh-ac"));
        el.sendKeys("Mobiles");
        el.sendKeys(Keys.ENTER);
        
        
      
        
        String str =  driver.getTitle();
        System.out.println(str);
        
        if(str.contains("mobiles")) 
        	System.out.println("Correct Title");
        	
      
        else
        	System.out.println("Wrong Title");
        
  
        
      List<WebElement> ls= driver.findElements(By.xpath("//h3[@class='s-item__title']"));
      int total =  ls.size();
      
       System.out.println(total);
      
      
      for(int i=0; i<ls.size();i++) {
    	  String s = ls.get(i).getText();
    	  if(s.contains("Samsung")) {
    		  System.out.println(s);
    	  }
      }
      
      }
}
      
        
	


