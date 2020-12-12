package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	public DashBoardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "welcome")
	private WebElement flechitaWelcome;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	private WebElement linkLogout;
	
	public void logOut() throws InterruptedException {
		flechitaWelcome.click();
		Thread.sleep(1000);
		linkLogout.click();
	}
}
