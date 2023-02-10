package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Locator
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement inputFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement inputLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement inputEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement inputTelephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement inputPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement inputCPassword;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]")
	WebElement newsLetterYesBtn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
	WebElement newsLetterNoBtn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement privacyAgreeBtn;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement continueBtn;
	
	
	//Action
	
	public void inputFirstName(String firstName) {
		inputFirstName.sendKeys(firstName);
	}
	public void inputLastName(String lastName) {
		inputLastName.sendKeys(lastName);
	}
	public void inputEmail(String eMail) {
		inputEmail.sendKeys(eMail);
	}
	public void inputTelephone(String telePhone) {
		inputTelephone.sendKeys(telePhone);
	}
	public void inputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	public void inputCPassword(String password) {
		inputCPassword.sendKeys(password);
	}
	public void newsLetterYesBtn() {
		newsLetterYesBtn.click();
	}
	public void newsLetterNoBtn() {
		newsLetterNoBtn.click();
	}
	public void privacyAgreeBtn() {
		privacyAgreeBtn.click();
	}
	public void continueBtn() {
		continueBtn.click();
	}
	


}
