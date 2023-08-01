package actionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
			WebElement watchjwellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
			
			Actions act=new Actions(driver);
			act.moveToElement(watchjwellery).perform();
			driver.findElement(By.xpath("//a[text()='Band']")).click();
			
			WebElement filterby = driver.findElement(By.xpath("//div[text()='Filter by']"));
			Thread.sleep(2000);
			
			for(int i=0;i<=2;i++)
			{
				act.clickAndHold(filterby).perform();
			}
				
			//copy the filter using robot class
			Robot robot=new Robot(); 
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
			
			driver.findElement(By.name("search_query")).click();
			

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			WebElement searchboxbutton = driver.findElement(By.name("submit_search"));
			searchboxbutton.submit();
			
			
			
			
			
			
			
			
	}
}
