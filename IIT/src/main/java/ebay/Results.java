package ebay;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Results extends Base
{
	List<WebElement> ls;
	public void getTotalResults()
	{
		ls= driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		int total =  ls.size();
		System.out.println(total);
	}
	public void getProductList()
	{
		for(int i=0; i<ls.size();i++) {
			String s = ls.get(i).getText();
			if(s.contains("Samsung")) {
				System.out.println(s);
			}
		}

	}
}
