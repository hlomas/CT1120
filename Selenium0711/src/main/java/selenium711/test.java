package selenium711;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;	// Traer el path del proyecto y el separator es el '/' y con esto seteamos el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); 	// Identificando el ejecutable para el driver
		WebDriver driver = new ChromeDriver();	// Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");	// Abriendo el Chrome con la URL especificada
	}

}
