package Pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class FeedPage {

	//Objects
	///'Search' button
	@FindBy (id="")
	public static MobileElement searchBtn;
	
	///'Settings' button
	@FindBy (id="")
	public static MobileElement settingsBtn;
	
	///Follow — find your friends to connect card
	@FindBy (id="")
	public static MobileElement onboardingCard;
}
