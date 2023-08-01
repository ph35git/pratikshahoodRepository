package pageOjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//store all the web element of login page
	
	//declare with @findBy annotation
	@FindBy(name="username")private WebElement usernameTB;
	@FindBy(name="pwd")private WebElement passwordTB;
	@FindBy(id="LoginButton")private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement keepLoggedInCheckBox;
	@FindBy(linkText="Actimind Inc.")private WebElement Actimindlink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}

	public WebElement getActimindlink() {
		return Actimindlink;
	}
	
	//operational methods
	public void validLogin(String validUsername,String validPassword)
	{
		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		LoginButton.click();
		
	}
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		LoginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
		
	}
	

}
