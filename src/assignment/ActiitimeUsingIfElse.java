package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiitimeUsingIfElse {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://desktop-as2vg5u/login.do");
		String homepageTitle = "actiTIME - Login";

		if (driver.getTitle().equals(homepageTitle)) {
			System.out.println("(HOME PAGE DISPLAY), test case pass");

			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

			driver.get("http://desktop-as2vg5u/user/submit_tt.do");
			String welcomepageTitle = "actiTIME - Enter Time-Track";

			if (driver.getTitle().equals(welcomepageTitle)) {
			    System.out.println("(WELCOME PAGE DISPLAY), test case pass");
			} else {
				System.out.println("(WELCOME PAGE NOT DISPLAY), test case failed");
			}
		} else {
			System.out.println("(HOME PAGE NOT DISPLAY), test case failed");
		}
	}
}
