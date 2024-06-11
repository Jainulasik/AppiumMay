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

public class GeneralStoreApp_Test_TillWebBrowser {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		withIPAddress("127.0.0.1").usingPort(4723).build();
		
		//GENERAL STORE APP

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setCapability("deviceName", "Nexus 5");
		options.setCapability("app","C:\\Users\\Lenovo\\Documents\\Appium_Test_May\\src\\test\\resources\\General-Store.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		
		
		// TESTING PRODUCT AND ADDED TO CART AND GOES TO WEB BROWSER
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"));"));
		
		Thread.sleep(1000);
		
       driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Canada\"]")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Asik");
       
       Thread.sleep(1000);
       driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.className("android.widget.CheckBox")).click();
       
       Thread.sleep(1000);
       driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
       
       Thread.sleep(10000);
       Set<String> allids = driver.getContextHandles();
       System.out.println(allids);
       
       // [NATIVE_APP, WEBVIEW_com.androidsample.generalstore]

       
       
       
       
       
       
		
		
		
		
//		WebElement auto = driver.findElement(AppiumBy.accessibilityId("Auto Complete"));
//		auto.click();
//		
//		Thread.sleep(2000);
//
//		WebElement screen = driver.findElement(AppiumBy.accessibilityId("1. Screen Top"));
//		screen.click();
//		
//		Thread.sleep(2000);
//
//		WebElement conuntry = driver.findElement(By.id("io.appium.android.apis:id/edit"));
//		conuntry.sendKeys("India");
//		
//		Thread.sleep(2000);
//		WebElement givemefocus = driver.findElement(AppiumBy.accessibilityId("Give me Focus"));
//		givemefocus.click();
//		
		
		
		
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(1000);
	//	driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
