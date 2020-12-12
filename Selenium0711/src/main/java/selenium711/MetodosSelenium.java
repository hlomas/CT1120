package selenium711;

//import java.awt.List;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MetodosSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("test");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers"
				+ File.separator; /*
									 * Traer el path del proyecto y el separator es el '/' y con esto seteamos el
									 * path de nuestro driver
									 */
		System.setProperty("webdriver.chrome.driver",
				exePath + "chromedriver"); /* Identificando el ejecutable para el driver */
		WebDriver driver = new ChromeDriver(); /* Creacion en tiempo de ejecucion de nuestro ChromeDriver */
		driver.get("https://opensource-demo.orangehrmlive.com/"); /* Abriendo el Chrome con la URL especificada */
		WebElement  userName = driver.findElement(By.id("txtUsername"));
		WebElement  password = driver.findElement(By.id("txtPassword"));
		WebElement  btnLogin = driver.findElement(By.id("btnLogin"));
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		boolean flag = url.contains("/dashboard");
		
		if (flag) {
			System.out.println("Ok");
		}else {
			System.out.println("Ko");
		}
		
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//driver.manage().window().maximize();//Maximizar Ventana
		
		/*driver.close();
		
		driver.quit();*/
		
		WebElement assignLeave = driver.findElement(By.className("quickLinkText"));
		
		assignLeave.click();
		Thread.sleep(3000);
		WebElement employeeName = driver.findElement(By.id("assignleave_txtEmployee_empName"));
		employeeName.sendKeys("Henry Lomas");
		Thread.sleep(5000);
		
		employeeName.clear();
		
		String welcomeMesg = driver.findElement(By.id("welcome")).getText();
		boolean userMesg = welcomeMesg.contains("Paul");
		if (userMesg) {
			System.out.println("Has Paul");
		}else {
			System.out.println("Has NO Paul");
		}
		
		Select oSelect  = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		oSelect.selectByVisibleText("US - FMLA");
		Thread.sleep(2000);
		
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		String firstMenuString = firstLevelMenu.get(0).getText();
		System.out.println(firstMenuString);
		
		driver.close();
		driver.quit();
		
	}

}
