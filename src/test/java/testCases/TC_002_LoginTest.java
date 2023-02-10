package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups = {"Sanity", "Master"})
	public void test_Login() throws InterruptedException 
	{
		logger.info("***     Sarting TC_002     ***");
		HomePage hp = new HomePage(driver);
		hp.clickmyAccount();
		hp.clickLogin();
		logger.info("***     Clicked on login from HomePage      ***");

		LoginPage lp = new LoginPage(driver);
		lp.inputEmail("abc@gmail.com");
		lp.inputPassword("abc123"); 
		logger.info("***     Input All Values     ***");
		lp.clickLoginBtn();
		logger.info("***     Clicked on Login     ***");
		
		MyAccountPage map = new MyAccountPage(driver);
		logger.info("***     Inside MyAccount Page     ***");
		map.clickLogoutBtn(); 
		logger.info("***     Clicked logout     ***");
		
		LogoutPage lop = new LogoutPage(driver);
		lop.confLogout();
		lop.continueBtn();
		Thread.sleep(3000);
	}
	
	

}
