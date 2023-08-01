package javaExecutiveScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.instagram.com/");
			
			//TO PERGFORM SCROLLING OPERATION
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			
			//SCROLL DOWN
			jse.executeScript("window.scrollBy(0,350)");
			//SCROLL UP
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,-350)");
			
			
	}		
}
