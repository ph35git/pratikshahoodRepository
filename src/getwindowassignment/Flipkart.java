package getwindowassignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {


public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.driver.chrome","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//handleofparentwindow
		String parenthandle = driver.getWindowHandle();
						
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		Thread.sleep(2000);
		
		Set<String> allhandle = driver.getWindowHandles();
		for(String wh:allhandle)
		{
			if(allhandle.equals(wh))
			{
			 driver.switchTo().window(wh);
						
			}
			else {
				
			}
		}
		String actualtitle = driver.getTitle();
		if(actualtitle.equals("SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)"))
		{
			System.out.println("its a child");
		}
		else {
			System.out.println("window not handle");
		}
		WebElement scrolltillthewebelemet = driver.findElement(By.xpath("//span[text()='View Details']"));
		
		Point point = scrolltillthewebelemet.getLocation();
		int xaxis=point.getX();
		int yaxis=point.getY();
		
		 Thread.sleep(2000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
		    
		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']a")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		
		
}
}
