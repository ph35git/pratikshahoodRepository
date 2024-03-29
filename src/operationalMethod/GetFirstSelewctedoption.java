package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelewctedoption {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/Priyanka%20Hood/Desktop/wcsm8/multiselectdropdown.html");
		 
		 WebElement dropdown = driver.findElement(By.id("i1"));
		 
		 Select sel = new Select(dropdown);
		
		 //BY USING FOR LOOP
		 for(int i=0; i<6; i++)
		 {
			 sel.selectByIndex(i);
		 }
		 Thread.sleep(2000);
		 WebElement firstoption = sel.getFirstSelectedOption();
		 String value = firstoption.getText();
		 System.out.println(value);
		 
		 
		 }
}
