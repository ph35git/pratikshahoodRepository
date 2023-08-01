package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath6 {
	
	// XPATH BY USING INDEPENDANT AND DEPENDANT //
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("HP laptop");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[text()='Brand']")).click();
			driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Operating System')]")).click();
			driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
			Thread.sleep(4000);
			String priceoffirstsuggetion= driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
			System.out.println(priceoffirstsuggetion);
			Thread.sleep(4000);

			driver.quit();
	
	}
}
