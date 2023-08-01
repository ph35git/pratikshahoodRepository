package keyworddrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class validLoginTestCase extends BaseTest {
  
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//to open the browser create the obj and basetest
		
		 BaseTest bt = new BaseTest();
		 
		 //read the data from property file
		 
		 Flib flib = new Flib();
		 
		 bt.openbrowser();
		 
		 
		 driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"username"));
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"password"));
		 
		 driver.findElement(By.id("loginpage")).click();
		 Thread.sleep(2000);
		 bt.closebrowser();
	}
	
}
