package pageOjectModel;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		
		Thread.sleep(2000);
		 LoginPage lp = new LoginPage(driver);
		
		int rc = flib.rowcount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
		  
			String invalidUsername = flib.readExceldata(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExceldata(EXCEL_PATH, "invalidcreds", i, 1);
			lp.invalidLogin(invalidUsername, invalidPassword);
		}
		bt.tearDown();
		
	}

}
