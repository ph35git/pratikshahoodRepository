package frameHandle;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blueStoneFrame {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
			Thread.sleep(2000);
			WebElement framelement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
			driver.switchTo().frame("fc_widget");//by using name and id
			
			//driver.switchTo().frame(framelement);//by using webelement as frame
			
			
			
			WebElement chatox = driver.findElement(By.id("chat-icon"));
			
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.elementToBeClickable(chatox)).click();
			
			 driver.switchTo().defaultContent();
			 
			 driver.findElement(By.id("chat-fc-name")).sendKeys("pratiksha");
			 driver.findElement(By.id("chat-fc-email")).sendKeys("phood@gmail.com");
			 driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
			 
			 
	

				
	}
}
