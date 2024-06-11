package org.baseclass;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;



public class BaseClass {


	//START SERVER AND LAUNCH APLICATION

	public static AndroidDriver driver;

	public static void startServer(String devicename,String devicepath)throws MalformedURLException, InterruptedException { 

		AppiumDriverLocalService build =
				new AppiumServiceBuilder().
				withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
				withIPAddress("127.0.0.1").usingPort(4723).build();

		build.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setCapability("deviceName", devicename);
		options.setCapability("app",devicepath);


		// CREATE OBJECT FOR ANDROID DRIVER

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);


	}
	public static void textSend(WebElement element,String keys) {
		element.sendKeys(keys);
	}

	public static void backforward (String name) {
		if (name.equalsIgnoreCase("back")) {
			driver.navigate().back();

		}

		else if (name.equalsIgnoreCase("forward")) {
			driver.navigate().forward();

		}

	}

	public static void buttonClick(WebElement element) {
		element.click();

	}

	public static void scroll(String texts) {



		driver.findElement(AppiumBy.androidUIAutomator
				("new UIScrollable(new UISelector()).scrollIntoView(text(\""+texts+"\"));"));
	}
	
	

	public static void  swipe (WebElement element,String swipedirection,double swipePercent ) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile:swipeGesture", 
				ImmutableMap.of("elementid",((RemoteWebElement)element).getId()),swipedirection,"percent",swipePercent);
	}

	public static void longPress (WebElement element,int milliseconds) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile:clickLongGesture", 
				ImmutableMap.of("elementid",((RemoteWebElement)element).getId()),"duration",milliseconds);

	}

	public static void dragandDrop (WebElement element,int endx,int endy) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile:dragGesture", 
				ImmutableMap.of("elementid",((RemoteWebElement)element).getId()),"endx",endx,"endy",endy);
	}

	public static void threads () throws InterruptedException {

		Thread.sleep(2000);
	}

	public static void rotateDevie (int x , int y ,int z) {

		DeviceRotation device = new DeviceRotation(x,y,z);
		driver.rotate(device);

	}

	public static String clipboard (String text) {
		driver.setClipboardText(text);
		String clipboardText = driver.getClipboardText();
		return clipboardText;
	}


	public static void keyActions (String name) {
		if (name.equalsIgnoreCase("back")) {
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
		}
		else {
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
		}


	}



}





