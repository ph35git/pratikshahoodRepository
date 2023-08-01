package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDesplayedMethod {
    public static void main(String[] args) {
	System.setProperty("WebDriver.driver.chrome","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.netflix.com/in/login");
	WebElement USNTB = driver.findElement(By.name("userLoginId"));
	WebElement PASSTB = driver.findElement(By.name("password"));
	WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
	
	if( USNTB.isDisplayed())
	{
		 USNTB.sendKeys("pratiksha@123");
	}
	else {
		System.out.println("will get exception");
	}
	if(PASSTB.isDisplayed())
	{
		PASSTB.sendKeys("pass123");
	}
	else {
		System.out.println("will get exception");
	}
	if(button.isDisplayed())
	{
		button.click();
	}
	else {
		System.out.println("will get exception");
	}
	
}
}
