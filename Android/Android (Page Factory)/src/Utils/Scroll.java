package Utils;

import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Scroll extends AbstractTest {
	
	
	public static void pullToRefresh() throws InterruptedException {
		//Get the size of screen. 
		Dimension size = driver.manage().window().getSize(); 
		//Find swipe start and end point from screen's width and height. 
		//Find starty point which is at bottom side of screen. 
		int starty = (int) (size.height * 0.90); 
		//Find endy point which is at top side of screen. 
		int endy = (int) (size.height * 0.20); 
		//Find horizontal point where you wants to swipe. It is in middle of screen width. 
		int startx = size.width / 2; 
		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx); 
		//Swipe from Bottom to Top. driver.swipe(startx, starty, startx, endy, 3000); 
		Thread.sleep(5000); 
		//Swipe from Top to Bottom. 
		driver.swipe(startx, endy, startx, starty, 3000);
		Thread.sleep(3000);
	}
	
	public static void scrollToElement(AndroidDriver<MobileElement> driver, MobileElement {ELEMENTNAME}, boolean scrollDown){
		String listID = ((RemoteWebElement) driver.findElementByAndroidUIAutomator("new UiSelector().class(\"android.widget.ImageView\")")).getId();
		//Object first_textview = find_element(UiAutomator, new UiSelector().className("android.widget.TextView").instance(0));
		String direction;
		if (scrollDown) {
			direction = "down";
		} else {
			direction = "up";
		}
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("scrollDown", direction);
		scrollObject.put("element", listID);
		driver.executeScript("mobile: scrollTo", scrollObject);
	} 

}
