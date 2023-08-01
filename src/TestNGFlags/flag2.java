package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2 {
	
	//method or annotation is enabled or disabled
	
  @Test(description="login mehod")
  public void method1()
  {
	  Reporter.log("login performed!!", true);
  }
  
  @Test(enabled=false,description="logout method")
  public void method2()
  {
	  Reporter.log("logout perform!!", false);
  }
}
