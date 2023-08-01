package keyworddrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class InvalidLoginTestData extends BaseTest {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowcount("EXCEL_PATH", "invalidcreds");
		
		for(int i=1;i<rc;i++)
		{
			String invalidusername=flib.readExceldata("EXCEL_PATH", "invalidcreds", i, 0);
			String invalidpassword=flib.readExceldata("EXCEL_PATH", "invalidcreds", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("usernmae")).clear();
		}
		
		bt.closebrowser();
		
	}


	
}
