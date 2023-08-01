package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setSizeAndSetPositionMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		    
			driver.get("https://www.instagram.com/");
			System.out.println(driver.getTitle());
			
			Dimension targetsize=new Dimension(350,450);
			driver.manage().window().setSize(targetsize);
			
			Point targetposition=new Point(350, 450);
			driver.manage().window().setPosition(targetposition);
			
			Thread.sleep(2000);
			driver.close();
			
	}
}
