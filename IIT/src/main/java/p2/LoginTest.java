package p2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
      WebDriver driver;
      
      @BeforeClass
    
      
	void setup() {

    	  System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
  	    driver = new ChromeDriver();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	    driver.get("https://demoqa.com/automation-practice-form");
	}
      
	
	void login() {
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName("smith");
		lp.setPassword("dave");
		
	}
	
	
}
