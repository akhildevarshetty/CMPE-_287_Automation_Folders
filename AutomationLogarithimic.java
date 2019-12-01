package com.sjsu.photomath;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;



public class AutomationLogarithimic {
	
	public static void main(String args[] ) throws MalformedURLException   {
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4e47515159393498");
	dc.setCapability("platformName", "android");
	dc.setCapability("appPackage", "com.microblink.photomath");
	dc.setCapability("appActivity", ".main.LauncherActivity");
	//dc.setCapability("noReset", true);
	
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	MobileElement el1,el2,el3,el4,el5,el6,el7,el8;
	
	 //Testcase 1 For a Log single Function
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_background");
	 el3.click();
	
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");

	 
	 //Test Case 2 for Log Multiple Functions
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 //TestCase 3 for single function Log
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 //Test case 4 for Single Log function
	 
	
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 // Test case 5 for Log function with squares
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 // Test Case 6 for Log function with linear equation 
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 
 
	 //Test Case 7 for Log function with multiple answers
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 
	 //Test case 8 for Log function with x=0
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 //Test Case 9 for natural log
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 //Test Case 10 for log base 10
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 
	 // Test Case 11 Log
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 //Test Case 12 Log
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 el6 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el6.click();
	 el7 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el7.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 
	 
	 //Test Case 13
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 el6 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el6.click();
	 el7 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el7.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 
	 
	 //Test Case 14
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 el6 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el6.click();
	 el7 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el7.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 
	 //Test Case 15
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
		 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 //Test Case 16
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 //Test Case 17
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 //Test Case 18
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 //Test Case 19
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 
	 el7 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el7.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 
	 //TestCase 20
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 el4 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el4.click();
	 el5 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el5.click();
	 el6 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_header");
	 el6.click();
	 el7 = (MobileElement) driver.findElementById("com.microblink.photomath:id/card_equation_view");
	 el7.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Solutions");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"Solve the equations");
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Graph");
	 
	 
	 //Test Case 21 Negitive Scenario
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"We haven't solved it yet but we will soon");
	 
	 
	 //Test Case 22 Negitive Scenario
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Make Sure that whole Math problem is in the frame");
	 
	 
	//Test Case 23 Negitive Scenario
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"We haven't solved it yet but we will soon");
	 
	 
	 //Test Case 24 Negitive Scenario
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Make Sure that whole Math problem is in the frame");
	 
	 
	//Test Case 25 Negitive Scenario
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"We haven't solved it yet but we will soon");
	 
	 
	 //Test Case 26 Negitive Scenario
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Make Sure that whole Math problem is in the frame");
	 
	 
	//Test Case 27 Negitive Scenario
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"We haven't solved it yet but we will soon");
	 
	 
	 //Test Case 28 Negitive Scenario
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Make Sure that whole Math problem is in the frame");
	 
	//Test Case 29 Negitive Scenario
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"We haven't solved it yet but we will soon");
	 
	 
	 //Test Case 30 Negitive Scenario
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Make Sure that whole Math problem is in the frame");
	 
	//Test Case 31 Negitive Scenario
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/card_header").getText(),"We haven't solved it yet but we will soon");
	 
	 
	 //Test Case 32 Negitive Scenario
	 
	 el1 = (MobileElement) driver.findElementById("com.microblink.photomath:id/overlay_window");
	 el1.click();
	 el2 = (MobileElement) driver.findElementById("com.microblink.photomath:id/camera_button_image");
	 el2.click();	
	 el3 = (MobileElement) driver.findElementById("com.microblink.photomath:id/scrollable_container_header");
	 el3.click();
	 
	 Assert.assertEquals(driver.findElementById("com.microblink.photomath:id/scrollable_container_header").getText(),"Make Sure that whole Math problem is in the frame");
	
	}
}