package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy(linkText = "My Account")
	WebElement myAccount; 
	
	@FindBy(linkText = "Login")
	WebElement login; 
	
	@FindBy(linkText = "Register")
	WebElement register;
	
	
	//Actions
	public void clickmyAccount() {
		myAccount.click();
	}
	
	public void clickRegister() {
		register.click();
	}
	
	public void clickLogin() {
		login.click();
	}

}
