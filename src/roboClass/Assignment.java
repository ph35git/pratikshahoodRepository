package roboClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.selenium.dev/");
			
			WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
			
			Actions act=new Actions(driver);
			act.contextClick(target).perform();
			
			Robot robot=new Robot();
			for(int i=0;i<10;i++)
			{
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(2000);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);	
			}
		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
	}	
}
