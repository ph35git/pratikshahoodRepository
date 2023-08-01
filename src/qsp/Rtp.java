package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("select the browser which you want to open!!");
		String browserValue = sc.next();

		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "./drivers/chromdriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();

		} else if (browserValue.equalsIgnoreCase("edge"))

		{

			System.setProperty("WebDriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();

			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.close();
		}
		
		else {
			System.out.println("select the valid browser value!!!");
		}
	}
}