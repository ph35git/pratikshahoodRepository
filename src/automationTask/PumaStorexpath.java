package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaStorexpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://in.puma.com/in/en");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Women']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='PUMA White-Vivid Violet-PUMA Gold']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='6']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@id='qty-dropdown']")).click();
			driver.findElement(By.xpath("//select[@id='qty-dropdown']")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Add to Cart']")).click();
			
			
}
}
