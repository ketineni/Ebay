import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	ChromeDriver driver;
	By email = By.id("email");
	
	By password = By.id("pass");
	
	By login = By.name("login");
	
	public void openUrl( ) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
    public void login() throws IOException, Exception   {
    	  Actions ac = new Actions(driver);
    	   
    	   WebElement el = driver.findElement(By.xpath("//button[@title='Allow All Cookies']"));
    	   ac.moveToElement(el).click().perform();
    	   
    	driver.findElement(email).sendKeys("Su");
    	driver.findElement(password).sendKeys("123");
       WebElement e = driver.findElement(login);
       ac.moveToElement(e).click().perform();
       Thread.sleep(2000);
    	
    	File f = driver.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(f, new File("d:\\fb.png"));  

    	
    	
    }
    public void closeBrowser() {
    	
    	driver.close();
    	
    }
	public static void main(String[] args) throws IOException {
		Facebook f = new Facebook();
		f.openUrl();
		try {
			f.login();
		} catch (IOException e) {
			
			e.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		f.closeBrowser();

	}

}
