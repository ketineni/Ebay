import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginDemo {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      driver.get("https://demoqa.com/select-menu");
		      // getTitle() to obtain page title
		      System.out.println("Page title is : " + driver.getTitle());

		      Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		      
		     List<WebElement> ele =    sel.getOptions();
		      
		     for(WebElement opt: ele) {
		    	 System.out.println(opt.getText());
		    	 
		     }

		     sel.selectByIndex(0);
		     System.out.println("Select value is:"+ sel.getFirstSelectedOption().getText());
		     
	}
	
	
		     
		     
		        

	}

