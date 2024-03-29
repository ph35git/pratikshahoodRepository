package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("http://desktop-as2vg5u/login.do");
			
			WebElement usernameTB = driver.findElement(By.name("username"));
			usernameTB.sendKeys("admin");
			WebElement passwardTB = driver.findElement(By.name("pwd"));
			passwardTB.sendKeys("manager");
			
			Thread.sleep(2000);
			usernameTB.clear();
			Thread.sleep(2000);
			passwardTB.clear();
			
	}			
}
