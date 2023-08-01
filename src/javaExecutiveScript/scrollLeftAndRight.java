package javaExecutiveScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollLeftAndRight {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
			
			//TO PERGFORM SCROLLING OPERATION
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			
			//SCROLL RIGHT
			jse.executeScript("window.scrollBy(50000,0)");
			Thread.sleep(2000);
			
			//SCROLL LEFT
			jse.executeScript("window.scrollBy(-50000,0)");
			
			
	}			
}
