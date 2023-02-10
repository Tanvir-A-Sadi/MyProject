package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationConfirmationPage;
import pageObjects.LogoutPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass{
	@Test(groups = {"Regression", "Master"})
	public void testAccountRegistration() {
		logger.info("***     Starting TC_001       ***"	);
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickmyAccount();
		hp.clickRegister();
		logger.info("***     Clicked on My account and Register       ***"	);
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.inputFirstName(generateString(6));
		rp.inputLastName(generateString(6));
		rp.inputEmail(generateEmail(generateAlphaNumeric(6)));
		rp.inputTelephone(generateNumeric(10));
		String password = generateAlphaNumeric(6);
		rp.inputPassword(password);
		rp.inputCPassword(password);
		rp.newsLetterYesBtn();
		rp.privacyAgreeBtn();
		rp.continueBtn();	
		logger.info("***     Input user data and clicked continue      ***"	);
		
		RegistrationConfirmationPage rcp = new RegistrationConfirmationPage(driver);
		boolean rcpStatus = rcp.confAccountCreation();
		Assert.assertEquals(rcpStatus, true);
		logger.info("***   Registration Confirmed   ***"	);
		rcp.clickLogoutBtn(); 
		logger.info("***     Clicked Logout       ***"	);
		
		LogoutPage lop = new LogoutPage(driver);
		boolean lopStatus = lop.confLogout();
		Assert.assertEquals(lopStatus, true);
		logger.info("***     Logout Confirmed      ***"	);
		lop.continueBtn();
		logger.info("***     Clicked Continue       ***"	);
		logger.info("***     Test Passed!       ***"	);
		}
		catch (Exception e) 
		{
			Assert.fail();
			logger.info("***     Test Failed       ***"	);
		}
		
		
	}
	
	

}
