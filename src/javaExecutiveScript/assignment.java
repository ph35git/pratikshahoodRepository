package javaExecutiveScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
	    WebElement v1 = driver.findElement(By.xpath("//a[contains(@class,'selenium-button selenium-web')]"));
	    Point point = v1.getLocation();
	    int xaxis = point.getX();
	    int yaxis = point.getY();
	    
	    Thread.sleep(2000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
	    
	}
}
