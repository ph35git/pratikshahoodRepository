package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demoMethod() {
	  Reporter.log("Hii TestNG...!!",true);
  }
}
