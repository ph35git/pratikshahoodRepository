package takescreenshort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
		    //taking ss of selenium.dev wp
			driver.get("https://www.selenium.dev/");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			//implementation of Method
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/ss1.png");
			
			
			Files.copy(src, dest);
	}			
}
