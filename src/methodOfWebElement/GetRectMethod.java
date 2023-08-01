package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
public static void main(String[] args) {
		
		System.setProperty("WebDriver.driver.chrome","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		Point rect = button.getLocation();
		
		//GET THE LOCATION OF WEBELEMENT
		
		int xaxis=rect.getX();
		int yaxis=rect.getY();
		System.out.println("X AXIS:"+xaxis+"   Y AXIS:"+yaxis);
		
		//GE THE HEIGHT AND WIDTH OF WEBELEMENT
		
		int H=rect.getX();
		int W=rect.getY();
		System.out.println("height: "+H+"  width: "+W);
	}
}
