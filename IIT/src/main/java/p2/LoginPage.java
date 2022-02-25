package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	LoginPage(WebDriver rdriver)	{
		
		ldriver = rdriver;
	   PageFactory.initElements(rdriver,this);
	   	
	   
	}

	
	@FindBy(id="firstName")
	WebElement txtusername;
	
	@FindBy(id="lastName")
	WebElement txtlastname;
	
	@FindBy(id="userEmail")
	WebElement txtemail;
	
	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
		
	}
	public void setPassword(String lname) {
		txtlastname.sendKeys(lname);
		
	}
	
}
