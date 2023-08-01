package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://desktop-as2vg5u/login.do");

		//readthevalidusernameFromeTHeActitimetedtdata
		FileInputStream fis = new FileInputStream("./data/Actitime.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);                        
		 Sheet sheet = wb.getSheet("validcreds");                             
		 Row row = sheet.getRow(1);                                        
		 Cell cell = row.getCell(0);                                      
		 String validusername = cell.getStringCellValue();                          
		 System.out.println(validusername);
		 
		 //readTheValidPasswordFromTheExcelFile
		 FileInputStream fis2= new FileInputStream("./data/Actitime.xlsx");
		 Workbook wb2 = WorkbookFactory.create(fis2);                      
		 Sheet sheet2 = wb.getSheet("validcreds");                                 
		 Row row2 = sheet2.getRow(1);                                       
		 Cell cell2 = row2.getCell(1);                                      
		 String validpassword =cell2.getStringCellValue();                          
		 System.out.println(validpassword);
		 
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(validusername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.quit();

		
	}
}
