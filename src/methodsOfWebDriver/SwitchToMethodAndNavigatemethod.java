package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMethodAndNavigatemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.google.com/");
			Thread.sleep(2000);
			
			driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
			
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.switchTo().activeElement().sendKeys("automation testing",Keys.ENTER);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.quit();
			
			
	}
	
		    
}
