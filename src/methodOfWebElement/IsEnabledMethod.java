package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	  public static void main(String[] args) {
			System.setProperty("WebDriver.driver.chrome","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.instagram.com/");
			WebElement loginbutton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
			boolean verifylogin = loginbutton.isEnabled();
			System.out.println(verifylogin);
			
			driver.findElement(By.name("username")).sendKeys("pratiksha");
			driver.findElement(By.name("password")).sendKeys("12345");
			
			boolean verify=loginbutton.isEnabled();
			System.out.println(verify);
			
			
	
}
}
 