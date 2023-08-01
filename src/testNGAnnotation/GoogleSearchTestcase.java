package testNGAnnotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestcase extends baseTest {
	
  @Test(description="search for java !!")
  
  public void search1() {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  
 @Test(description="search for SQL !!")
  
  public void search2() {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
 
 @Test(description="search for selenium")
 
 public void search3() {
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
 }
}
