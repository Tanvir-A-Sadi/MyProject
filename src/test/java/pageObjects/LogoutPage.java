package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
	
	public LogoutPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement confLogout;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement continueBtn;
	@FindBy(xpath = "//img[@title='Your Store']")
	WebElement logo;
	//Actions
	public boolean confLogout() 
	{
		return confLogout.isDisplayed();
	}
	
	public void continueBtn() 
	{
		continueBtn.click();
	}
	
	public void clickLogo() 
	{
		logo.click();
	}

}
