package javaExecutiveScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrolldownToSpecificLocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/mens");
		Thread.sleep(2000);
	    WebElement shoes = driver.findElement(By.xpath("//img[@class='w-full bg-puma-black-800 aspect-1-1']/ancestor::div[@class='relative w-full flex flex-col gap-2']/descendant::h3[contains(@class,'w')]/span[text()='Puma Black-Puma White-Lemon Chrome']"));
	    Point point = shoes.getLocation();
	    int xaxis = point.getX();
	    int yaxis = point.getY();
	    
	    Thread.sleep(2000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollby("+xaxis+","+(yaxis-5000+")"));
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(shoes)).click();
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
		
	}
}
