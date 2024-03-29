package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentOnSyncronization {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://www.flipkart.com/");
	   
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	   driver.findElement(By.xpath("//span[text()='Cart']")).click();
	   driver.findElement(By.xpath("//span[text()='Login']")).click();
	   Thread.sleep(2000);
	   driver.quit();
	    
	}
}
