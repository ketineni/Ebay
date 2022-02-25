package p1;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Sample {
	
	@BeforeMethod
	public void openUrl() {
		System.out.println("to open URL");
	}
	@Test
	public void login() {
		System.out.println("code to login");
	}
	@Test
	public void createUser() {
		System.out.println("Register a new user");
	}

}
