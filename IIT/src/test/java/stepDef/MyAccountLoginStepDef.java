package stepDef;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyAccountLoginStepDef {
	
	public WebDriver driver;

    @Given("^open browser$")
    public void open_browser() throws Throwable {
    	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }

    @When("^Enter the url \"([^\"]*)\"$")
    public void enter_the_url_something(String strArg1) throws Throwable {
    	driver.get("http://practice.automationtesting.in/");
   
    }
   

    @And("^Click on My Account Menu$")
    public void click_on_my_account_menu() throws Throwable {
    	driver.findElement(By.linkText("My Account")).click();
    
    }

    @And("^Enter registered username \"([^\"]*)\"and password \"([^\"]*)\"$")
    public void enter_registered_username_somethingand_password_something(String user, String pwd) throws Throwable {
     driver.findElement(By.id("username")).sendKeys(user);
     driver.findElement(By.id("password")).sendKeys(pwd);
    }


    @And("^Click on login button$")
    public void click_on_login_button() throws Throwable {

    	driver.findElement(By.name("login")).click();
       
    }

    @Then("^User must successfully login to the web page$")
    public void user_must_successfully_login_to_the_web_page() throws Throwable {
    	String str =driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]")).getText();
        Assert.assertEquals(true,str.contains("sumanamandava"));
        driver.close();
        }
        
     
    @Then("^Verify login$")
    public void verify_login() throws Throwable {
    	String str =driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]")).getText();
        if(str.contains("ERROR")) {
    	Assert.assertTrue(true);
        
    }
        else
        {
        	Assert.assertTrue(false);
        }

    }
}



