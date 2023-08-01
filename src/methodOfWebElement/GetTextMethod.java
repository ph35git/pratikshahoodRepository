package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			String button = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();
			System.out.println("login button text:" +button);
	
			
			String text = driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-l')]")).getText();
			System.out.println("fogot passwaod text:"+text);
	
			
	}		
}
