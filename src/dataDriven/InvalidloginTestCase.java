package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidloginTestCase extends flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://desktop-as2vg5u/login.do");

		// to read the data from external file create the obj of flib

		flib flib = new flib();
		int rc = flib.rowcount("./data/Actitime.xlsx", "invalidcreds");
		for (int i = 1; i <= rc; i++) {

			String invalidusername = flib.readExceldata("./data/Actitime.xlsx", "invalidcreds", i, 0);
			String invalidpassword = flib.readExceldata("./data/Actitime.xlsx", "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidusername);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("username")).clear();
			driver.close();

		}

	}
}
