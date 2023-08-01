package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMethod {
     

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/Priyanka%20Hood/Desktop/wcsm8/multiselectdropdown.html");
		 
		 WebElement dropdown = driver.findElement(By.id("i1"));
		 
		 Select sel = new Select(dropdown);
		 //select the option
		 for(int i=0;i<8;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(2000);
		     //deselect the option
			 sel.deselectByValue("v4");
			 Thread.sleep(2000);
			 sel.deselectByValue("v3");
		 }
		 }
}
