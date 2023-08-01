package webBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Priyanka%20Hood/Desktop/wcsm8/alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle pop-up
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		//alt.accept();
		
		System.out.println(alt.getText());
		alt.dismiss();
		
	}
}
