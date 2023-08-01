package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {
	
	// SCRIPT FOR AIRINDIA LOGIN PAGE //
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://www.airindia.in/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='From']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
			driver.findElement(By.xpath("//input[@id='to']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Goa, Dabolim Airport, GOI, India, IN");
			driver.findElement(By.xpath("//input[@name='_depdateeu1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='_retdateeu1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@name='ddladult1']")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@name='concessionaryType1']")).click();
			driver.findElement(By.xpath("//select[@name='concessionaryType1']")).sendKeys("student");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@name='_classType1']")).click();
			driver.findElement(By.xpath("//select[@name='_classType1']")).sendKeys("premium economy");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='btnbooking']")).click();

	}
}
