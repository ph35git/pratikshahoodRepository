package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.selenium.dev/downloads/");
			driver.findElement(By.linkText("4.9.0"));
			
			Actions act=new Actions(driver);
			act.contextClick().build().perform();//way 1
			
		//  act.contextClick().perform();	way 2
			
			
	}			
}
