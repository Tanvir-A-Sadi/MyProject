package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//*[@id=\"logo\"]/a/img")
	WebElement logo;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/a")
	WebElement newCustomerConBtn;
	@FindBy(xpath = "//*[@id=\"input-email\"]")
	WebElement inputEmail;
	@FindBy(xpath = "//*[@id=\"input-password\"]")
	WebElement inputPassword;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginBtn;
	
	
	//Actions
	
	public void clickLogo() 
	{
		logo.click();
	}
	public boolean isLogoDisplayed() 
	{
		return logo.isDisplayed();
	}
	public void clickContinueBtn() 
	{
		newCustomerConBtn.click();
	}
	public void inputEmail(String email) 
	{
		inputEmail.sendKeys(email);
	}
	public void inputPassword(String password) 
	{
		inputPassword.sendKeys(password);
	}
	public void clickLoginBtn() 
	{
		loginBtn.click();
	}


}
