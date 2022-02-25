import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoqa.com/alerts");
		 driver.findElement(By.xpath("//button[text()='Click me']")).click();
		 Alert sa = driver.switchTo().alert();
		 System.out.println(sa.getText());
		 sa.accept();
		 
		 driver.findElement(By.id("promtButton")).click();
		 Alert al = driver.switchTo().alert();
		 al.sendKeys("Hello");
		 Thread.sleep(2000);
		 al.accept();
		 
		String s = driver.findElement(By.id("promptResult")).getText();
		System.out.println(s);
		 
		 

	}

}
