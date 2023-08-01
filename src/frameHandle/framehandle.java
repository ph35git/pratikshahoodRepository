package frameHandle;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("file:///C:/Users/Priyanka%20Hood/Desktop/wcsm8/frame.html");
			Thread.sleep(2000);
			WebElement usernamebox = driver.findElement(By.id("i1"));
			usernamebox.sendKeys("admin");
			WebElement framelement = driver.findElement(By.name("frame"));
			
			//driver.switchTo().frame(0);//handle by using index value
			//driver.switchTo().frame("frame");//handle by using name or id 
            driver.switchTo().frame(framelement);
            Thread.sleep(2000);
            WebElement pwdtextbox = driver.findElement(By.id("i1"));
            pwdtextbox.sendKeys("manager");
            
            Thread.sleep(2000);
            pwdtextbox.clear();
            Thread.sleep(2000);
            //driver.switchTo().parentFrame();//switch the control toparent frame
            
            driver.switchTo().defaultContent();
            usernamebox.clear();
	}
}	
