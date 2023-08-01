package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath2 {
	
	// XPATH BY USING TEXT() FUNCTION //
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://in.puma.com/in/en/mens");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//P[text()='Extra 15% off auto-applied at checkout']")).click();
	}
}
