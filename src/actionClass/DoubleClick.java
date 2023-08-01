package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("http://desktop-as2vg5u/login.do");
            //LOGIN ACTITIME
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
 
			//HOME PAGE  CLICK ON SETTING
			driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
			//CLICK ON LOGO AND COLOR
			driver.findElement(By.xpath("//a[contains(.,'Logo & Color Scheme')]")).click();
			Thread.sleep(4000);
			//CLICK ON RADIO BUTTON
			driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
			//CLICK ON CHOOSE FILE BUTTON
			WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
			//CREAT A OBJECT OF ACTION CLASS
			Actions act=new Actions(driver);
			//USE DDOUBLECLICK METHOD
			Thread.sleep(2000);
			act.doubleClick(target).perform();
			Thread.sleep(2000);
			//driver.quit();
			
	}	
}
