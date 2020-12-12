package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_06_ParameterLogin {
	WebDriver driver = DriverSetup.setupDriver();
	LoginPage login = new LoginPage(driver);
	@BeforeTest
	public void starWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	@Parameters({"user","password"})
	public void TC_06(String user, String password) {
		login.login(user, password);
	}
	@AfterTest
	  public void closeDriver() {
		  driver.quit();
	  }
}
