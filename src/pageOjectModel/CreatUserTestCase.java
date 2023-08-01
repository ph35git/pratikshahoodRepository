package pageOjectModel;

import java.io.IOException;

public class CreatUserTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.userModuleMethod();
		
		Thread.sleep(2000);
		UserListPage ulp = new UserListPage(driver);
		
		String usn = flib.readExceldata(PROP_PATH, "createusers", 1, 0);
		String pass = flib.readExceldata(PROP_PATH, "createusers", 1, 1);
		String fn = flib.readExceldata(PROP_PATH, "createusers", 1, 2);
		String ln = flib.readExceldata(PROP_PATH, "createusers", 1, 3);
		
		Thread.sleep(2000);
		ulp.createUserMethod(usn,pass,fn,ln);
		Thread.sleep(2000);
		ulp.deleteUserMethod();
		
	}
	

}
