package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("poha");
			Thread.sleep(2000);
			List<WebElement> pohaOption = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
			
			for(int i=1; i < pohaOption.size();i++)
			{
			String poha = pohaOption.get(i).getText();
			System.out.println(poha);
			Thread.sleep(2000);
					 
			}
			
			driver.quit();

			
}
}
