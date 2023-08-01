package takescreenshort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshoofWeElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://www.instagram.com/");
			WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
			if(button.isEnabled())
			{
				System.out.println("we can take a screenshot");
			}
			else {
				System.out.println("we can do not login!! ss is taken");
				File src = button.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/webelement.jpg");
				
				Files.copy(src, dest);
			
			}
			
	}	
}
