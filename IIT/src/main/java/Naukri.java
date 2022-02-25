

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri
{

	public static void main(String[] args) throws AWTException 
	{
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://www.naukri.com/");
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Register']")).click();
		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		

		Robot r=new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("C:/Users/44793/Documents/1-GUIDE-TO-GCSE-COURSES-2020-2021.pdf"), null);//copy the text into clipboard memeory
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);


		r.keyPress(KeyEvent.VK_ENTER);
		
 
	}

}
