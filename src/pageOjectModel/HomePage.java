package pageOjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//A[@class='content users_selected selected']/DIV[2]/IMG/self::IMG") private WebElement userModule;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']/self::IMG") private WebElement taskModule;
	@FindBy(xpath="//A[@class='content tt']/IMG[@class='sizer']/self::IMG") private WebElement timeTrackModule;
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']/self::IMG") private WebElement reportModule;

	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getUserModule() {
		return userModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getReportModule() {
		return reportModule;
	}
	
	//operational method
	public void logOutMethod()
	{
		logoutLink.click();
	}
	
	public void userModuleMethod()
	{
		userModule.click();
	}
	
}
