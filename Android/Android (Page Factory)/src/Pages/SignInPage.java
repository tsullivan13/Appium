package Pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class SignInPage {
	
	//Objects
	///'Back' button
	@FindBy (id="com.package:id/header_left_button")
	public static MobileElement backBtn;
		
	///'Forward' button
	@FindBy (id="com.package:id/header_right_button")
	public static MobileElement fwdBtn;
		
	///Title 
	@FindBy (id="com.package:id/header_center_textview")
	public static MobileElement title;
		
	///Email field
	@FindBy (id="com.package:id/sign_in_email")
	public static MobileElement emailField;
		
	///Password field 
	@FindBy (id="com.package:id/sign_in_password")
	public static MobileElement passwordField;
		
	///Password field - Show Password
	@FindBy (id="com.package:id/sign_in_show_password")
	public static MobileElement showPasswordBtn;
	
	///Forgot Password link
	@FindBy (id="com.package:id/sign_in_forgot_password_button")
	public static MobileElement forgotPasswordBtn;
	
	///Terms & Privacy Policy link
	@FindBy (id="com.package:id/sign_in_agree_to_terms_text")
	public static MobileElement agreeToTerms;
	
	
}
