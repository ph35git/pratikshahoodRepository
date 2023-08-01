package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidLoginTestData extends flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://desktop-as2vg5u/login.do");
		
		//to read the data from external file creat the obj of flib

		flib flib = new flib();
		//String validusername = flib.readExceldata("./data/Actitime.xlsx","validcreds", 1, 0); //directly use in sendkeys
		//String validpassword = flib.readExceldata("./data/Actitime.xlsx","validcreds", 1, 1);
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(flib.readExceldata("./data/Actitime.xlsx","validcreds", 1, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExceldata("./data/Actitime.xlsx","validcreds", 1, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

	
}
