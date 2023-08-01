package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath5 {
	
	// XPATH BY USING CONTAINS() FUNCTION //
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://www.airasia.co.in/home");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains (text(),'PNQ')]")).sendKeys("pune");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='basic-url']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(), 'DEL')]")).sendKeys("delhi");
			Thread.sleep(2000);
			
	}
			
			
}
