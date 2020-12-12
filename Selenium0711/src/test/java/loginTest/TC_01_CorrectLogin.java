package loginTest;

import org.openqa.selenium.WebDriver;
import commonMethods.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01_CorrectLogin {
	WebDriver driver = DriverSetup.setupDriver();
	LoginPage login = new LoginPage(driver);
  @BeforeTest
  public void starWebDriver() {
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
  }
  @Test
  public void TC_01() {
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
  }
  @AfterTest
  public void closeDriver() {
	  CommomMethods.takeScreenhots(driver, "TC_01_CorrectLogin");
	  driver.quit();
  }
}
