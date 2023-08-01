package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Idlocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.netflix.com/in/Login");
			Thread.sleep(2000);
			driver.findElement(By.id("id_userLoginId")).sendKeys("acd@123");
			Thread.sleep(2000);
			driver.findElement(By.id("id_password")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
					
				
			
					
			
	}    
}
