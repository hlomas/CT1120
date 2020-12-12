package selenium711;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println( driver.manage().window().getSize());
		
		driver.close();
		driver.quit();
	}

}
