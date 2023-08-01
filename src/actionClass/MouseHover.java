package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
			WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();
			
			driver.findElement(By.xpath("//a[@title='Band']")).click();
			
	}
}
