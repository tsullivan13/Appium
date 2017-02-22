package Pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class SignUpPage {
	
	//Objects
	
	///'Back' button
	@FindBy (id="com.package:id/header_left_button")
	public static MobileElement backBtn;
	
	///'Forward' button
	@FindBy (id="com.package:id/header_right_button")
	public static MobileElement fwdBtn;
	
	///Title (returns Null currently 2/22/17 -TS)
	@FindBy (id="com.package:id/header_center_textview")
	public static MobileElement title;
	
	///Email field
	@FindBy (id="com.package:id/sign_up_email")
	public static MobileElement emailField;
	
	///Password field 
	@FindBy (id="com.package:id/sign_up_password")
	public static MobileElement passwordField;
	
	///Password field - Show Password
	@FindBy (id="com.package:id/sign_up_show_password")
	public static MobileElement showPasswordBtn;
	
	///Password field - Strength indicator
	@FindBy (id="com.package:id/sign_up_password_strength_indicator")
	public static MobileElement passStrengthInd;
	
	///Username field
	@FindBy (id="com.package:id/sign_up_username")
	public static MobileElement usernameField;
	
	///Username field - availability icon
	@FindBy (id="com.package:id/sign_up_username_availability")
	public static MobileElement usernameAvailibility;
	
	///Terms & Privacy Policy text 
	@FindBy (id="com.package:id/sign_up_agree_to_terms_text")
	public static MobileElement agreeToTermsText;
	
	///Terms & Privacy Policy radio button
	@FindBy (id="com.package:id/sign_in_agree_to_terms_selector")
	public static MobileElement agreeToTermsRadioBtn;
	
	//@FindBy (xpath="")
	
	
	//Methods
	public static String titleText() {
		return title.getText();
	}

}
