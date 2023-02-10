package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//div[@class='col-sm-9']//h2[1]")
	WebElement confMyAccount;
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
	WebElement logOutBtn;
	
	//Actions
	public boolean confMyAccount() {
		return confMyAccount.isDisplayed();
	}
	public void clickLogoutBtn() {
		logOutBtn.click();
	}

}
