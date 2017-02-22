package Tests;

import Pages.FeedPage;
import Pages.SignInPage;
import Pages.SignUpPage;
import Pages.SplashScreenPage;
import Utils.AbstractTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SplashScreenTests extends AbstractTest{
		//Test are working on V20 (1037)
	
	@Test (priority = 1)
	public void verifyAllElements() {
		Assert.assertTrue(SplashScreenPage.closeBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
		Assert.assertTrue(SplashScreenPage.descText.isDisplayed());
		Assert.assertTrue(SplashScreenPage.signUpBtn.isDisplayed());
		Assert.assertTrue(SplashScreenPage.signInBtn.isDisplayed());
	}
	
	@Test (priority = 2)
	public void tapSignUpBtn() throws InterruptedException {
		SplashScreenPage.tapSignUpBtn();
		Thread.sleep(2000);
		Assert.assertTrue(SignUpPage.usernameField.isDisplayed());
		SignUpPage.backBtn.click();
		Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
	}
	
	@Test (priority = 3)
	public void tapSignInBtn() throws InterruptedException {
		SplashScreenPage.tapSignInBtn();
		Thread.sleep(2000);
		Assert.assertTrue(SignInPage.forgotPasswordBtn.isDisplayed());
		SignInPage.backBtn.click();
		Assert.assertTrue(SplashScreenPage.splashText.isDisplayed());
	}
	
	@Test (priority = 4)
	public void tapCloseBtn() throws InterruptedException {
		SplashScreenPage.tapCloseBtn();
		Thread.sleep(2000);
		Assert.assertTrue(FeedPage.onboardingCard.isDisplayed());
	}

	
	
	

}
