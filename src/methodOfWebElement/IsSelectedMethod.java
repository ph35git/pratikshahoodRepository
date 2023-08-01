package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	 public static void main(String[] args) {
			System.setProperty("WebDriver.driver.chrome","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("http://desktop-as2vg5u/login.do");
			WebElement chatbox = driver.findElement(By.name("remember"));
			
			
			
			
	 }
}
