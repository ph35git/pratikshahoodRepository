package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
  @Test(description="login testcase")
  
  public void loginMethod() 
  {
	  Reporter.log("login performed!!", true);
  }
  
 @Test(description="create user testcase",dependsOnMethods="loginMethod")
  
  public void createuser() 
  {
	  Reporter.log("user created", true);
  }

 @Test(description="logout testcase",dependsOnMethods="createuser",alwaysRun=true)
 
 public void logoutMethod() 
 {
	  Reporter.log("logout performed!!", true);
 }

}
