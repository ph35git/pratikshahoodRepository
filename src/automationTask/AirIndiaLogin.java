package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://www.airindia.in/");
			driver.findElement(By.xpath("//a[text()=' Login/Enrol']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='signInName' and (@name='Email Address')]")).sendKeys("admin@gmail.com");
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//button[@type='submit']")).click();
			
				
	}
}

