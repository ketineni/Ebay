package ebay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home extends Base
{
	
	public void openUrl() {
		driver.get("https://www.ebay.co.uk/");
	}

	public void search() {
		WebElement el = driver.findElement(By.id("gh-ac"));
		el.sendKeys("Mobiles");
		el.sendKeys(Keys.ENTER);
	}

	public void validateTitle() {

		String str =  driver.getTitle();
		if(str.contains("mobiles")) 
			System.out.println("Correct Title");
		else
			System.out.println("Wrong Title");
	}
}
