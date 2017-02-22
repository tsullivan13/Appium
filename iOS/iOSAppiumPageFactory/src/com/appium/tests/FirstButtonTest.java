package com.appium.tests;

import org.testng.annotations.Test;

import com.appium.pages.ButtonsPage;
import com.appium.pages.LandingPage;
import com.appium.utils.AbstractTestiOS;

public class FirstButtonTest extends AbstractTestiOS {
	
	@Test
	public void clickFirstButton() throws InterruptedException {
		LandingPage.clickButtonsBtn();
		Thread.sleep(1000);
		//ButtonsPage.clickGrayBtn();
		ButtonsPage.clickBackBtn();
	}
	
	//@Test
	//public void clickBackButton() {
	//	ButtonsPage.clickBackBtn();
	//}
}
