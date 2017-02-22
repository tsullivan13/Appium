package Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashScreenPage extends AbstractPage {
	
	//Objects
	
	///'Close' button (X)
	@FindBy (id="com.package:id/splash_close_button")
	public static MobileElement closeBtn;
	
	///Splash text
	@FindBy (id="com.package:id/splash_text")
	public static MobileElement splashText;
	
	///Splash description
	@FindBy (id="com.package:id/splash_description_text")
	public static MobileElement descText;
	
	///'Sign up' button
	@FindBy (id="com.package:id/splash_sign_up_button")
	public static MobileElement signUpBtn;
	
	///'Sign in' button
	@FindBy (id="com.package:id/splash_sign_in_button")
	public static MobileElement signInBtn;
	
	
	//Methods
	
	///Tap the 'Sign up' button
	public static void tapSignUpBtn() {
		signUpBtn.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver), new SignUpPage());
	}
	
	///Tap the 'Sign in' button
	public static void tapSignInBtn() {
		signInBtn.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver), new SignInPage());
	}
	
	///Tap the 'Close' button (X)
	public static void tapCloseBtn() {
		closeBtn.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver), new FeedPage());
	}
}
