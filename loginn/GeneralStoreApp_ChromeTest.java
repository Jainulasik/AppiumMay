package org.loginn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class GeneralStoreApp_ChromeTest {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//GENERAL STORE APP

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setCapability("deviceName", "Pixel 8 Pro (May)");
		options.setCapability("app","C:\\Users\\Lenovo\\Documents\\Appium_Test_May\\src\\test\\resources\\General-Store.apk");
		options.setCapability("browserName", "Chrome");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		
		
		
		
		
		
		Thread.sleep(1000);
	//	driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
