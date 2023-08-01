package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.instagram.com/");
			
			Thread.sleep(2000);   //THREAD USE FOR STATIC WAIT //
			
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
			
			
	}

}
