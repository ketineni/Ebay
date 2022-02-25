import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, Exception {
		
	      WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("http://demo.automationtesting.in/Register.html");
	  
	      Thread.sleep(3000);
	      WebElement el = driver.findElement(By.xpath("//*[@id='imagesrc']"));
		
		 Actions ac = new Actions(driver);
		 ac.moveToElement(el).click().perform();
		 
		 Robot rt = new Robot();
		 
		 rt.setAutoDelay(1000);
		 
		 StringSelection ss = new StringSelection("C:\\Users\\44793\\Downloads\\punctuating_simple_sentences.doc");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 rt.setAutoDelay(1000);
		 
		 rt.keyPress(KeyEvent.VK_CONTROL);
		 rt.keyPress(KeyEvent.VK_V);
		 rt.keyRelease(KeyEvent.VK_CONTROL);


         rt.keyPress(KeyEvent.VK_ENTER);
			
		 

	  
	     	       
	
	

	}

}
