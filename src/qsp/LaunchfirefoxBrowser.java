package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchfirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("WebDriver.gecko.driver","./drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.close();

	}

}
