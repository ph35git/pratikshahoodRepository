package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void Method1() {
	  
	  long threadID = Thread.currentThread().getId();
	  Reporter.log(threadID+": is the thread id of Method", true);
	  Reporter.log("method 1", true);
  }
  
  @Test
  public void Method2() {
	  
	  long threadID = Thread.currentThread().getId();
	  Reporter.log(threadID+": is the thread id of Method", true);
	  Reporter.log("method 2", true);
  }

}
