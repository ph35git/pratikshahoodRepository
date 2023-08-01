package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssinmentOnShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	   
	   driver.get("https://www.shoppersstack.com/");
	   driver.findElement(By.xpath("//a[text()='Electronic']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Watch']")).click();
	   driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']")).click();
	   driver.findElement(By.id("Check Delivery")).sendKeys("580033");
	  
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();
	 
	}   
}
