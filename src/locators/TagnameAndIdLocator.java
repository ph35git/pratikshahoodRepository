package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagnameAndIdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.flipkart.com/?affid=admitad&affExtParam1=442763&affExtParam2=e729871abbf3caa99e357eddfb998efe");
			Thread.sleep(2000);
			driver.findElement(By.tagName("input")).sendKeys("shoes",Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.id("exehdJ")).click();
			Thread.sleep(2000);
			driver.close();
			
	}    
}
