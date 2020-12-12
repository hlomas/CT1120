package commonMethods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommomMethods {
	public static void takeScreenhots(WebDriver webdriver, String testCaseName) {
		File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = Paths.get("").toAbsolutePath().toString() + File.separator + "test-output" + File.separator + "ExecutionResult";
		
		try {
			FileHandler.createDir(new File(screenshotPath));
			
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png") );
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
