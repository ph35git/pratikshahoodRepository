package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actitimelogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.navigate().to("http://desktop-as2vg5u/login.do");
			Thread.sleep(2000);
			
			if(driver.getTitle().equals("actiTIME - Login"))
			{
			System.out.println("HOME PAGE DISPLAY");
			}
			else {
			System.out.println("HOME PAGE NOT DISPLAY");	
			}
	}
			
}
