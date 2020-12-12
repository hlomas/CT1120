package selenium711;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.NoSuchElementException;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers"
				+ File.separator; /*
									 * Traer el path del proyecto y el separator es el '/' y con esto seteamos el
									 * path de nuestro driver
									 */
		System.setProperty("webdriver.chrome.driver",
				exePath + "chromedriver"); /* Identificando el ejecutable para el driver */
		WebDriver driver = new ChromeDriver(); /* Creacion en tiempo de ejecucion de nuestro ChromeDriver */
		driver.get("https://opensource-demo.orangehrmlive.com/"); /* Abriendo el Chrome con la URL especificada */

		driver.manage().window().maximize();
		WebElement userName = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))/*Wait 20 secons to element be present*/
				.pollingEvery(Duration.ofSeconds(2))/*Verifing each 2 secs*/
				.ignoring(NoSuchElementException.class);/*Exception we ignore*/
		WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				driver.navigate().refresh();
				return driver.findElement(By.id("txtUsername"));
			}
		});
		txtUsername.click();
		driver.close();
		driver.quit();
	}

}
