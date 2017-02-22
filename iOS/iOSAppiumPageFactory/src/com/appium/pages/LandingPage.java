package com.appium.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.utils.AbstractPageiOS;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LandingPage extends AbstractPageiOS{

	//Objects
	@FindBy (xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	private static WebElement buttonsBtn;
	
	@FindBy (xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]")
	private static WebElement controlsBtn;
	
	
	
	//Methods
	public static void clickButtonsBtn() {
		buttonsBtn.click();
		//Return ButtonsPage
		PageFactory.initElements(new AppiumFieldDecorator(driver), new ButtonsPage());	
		}
}
