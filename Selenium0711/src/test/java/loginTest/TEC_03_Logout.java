package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashBoardPage;
import navigationPages.LoginPage;

public class TEC_03_Logout {
	WebDriver driver = DriverSetup.setupDriver();
	LoginPage login = new LoginPage(driver);
	DashBoardPage dashboard= new DashBoardPage(driver);
  @BeforeTest
  public void starWebDriver() {
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
  }
  @Test
  public void TC_03() throws InterruptedException {
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  
	  dashboard.logOut();
	  
	  
  }
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
