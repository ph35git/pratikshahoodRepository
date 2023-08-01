package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			// APPLY THE IMPLICITLY WAIT //
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.navigate().to("https://www.instagram.com/");
			driver.findElement(By.name("username")).sendKeys("admin");
			
			driver.findElement(By.name("password")).sendKeys("manager");
			
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
			Thread.sleep(2000);
			
			
	}

}

 