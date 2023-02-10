package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationConfirmationPage extends BasePage
{
	
	public RegistrationConfirmationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//div[@id='common-success']//div//div//h1")
	WebElement confAccoutCreation;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement continueBtn;
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
	WebElement logOutBtn;
	@FindBy(xpath = "//img[@title='Your Store']")
	WebElement webLogo;
	
	
	//Actions
	public boolean confAccountCreation() 
	{
		return confAccoutCreation.isDisplayed();
	}
	public void clickContinue() 
	{
		continueBtn.click();
	}
	
	public void clickLogoutBtn() 
	{
		logOutBtn.click();
	}
	public void clickLogo() 
	{
		webLogo.click();
	}


}
