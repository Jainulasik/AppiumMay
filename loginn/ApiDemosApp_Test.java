package org.loginn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ApiDemosApp_Test {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		withIPAddress("127.0.0.1").usingPort(4723).build();
		

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setCapability("deviceName", "Nexus 5");
		options.setCapability("app","C:\\Users\\Lenovo\\Documents\\Appium_Test_May\\src\\test\\resources\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		Thread.sleep(2000);
		WebElement text = driver.findElement(AppiumBy.accessibilityId("Text"));
		text.click();
		Thread.sleep(2000);

		driver.navigate().back();
		
		Thread.sleep(2000);

		// LONG PRESS
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));"));

		Thread.sleep(2000);

		WebElement view = driver.findElement(AppiumBy.accessibilityId("Views"));
		view.click();
		
		Thread.sleep(2000);
		
		WebElement expList = driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));		
		expList.click();
		
		Thread.sleep(2000);

		WebElement custom = driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
		custom.click();
		
		
		WebElement peoplenames = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("mobile:longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)peoplenames).getId(),"duration",2000));
		
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().back();
        Thread.sleep(2000);

		// SWIPE
		
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement image = driver.findElement(By.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]"));
		
		
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("mobile:swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)image).getId(),"direction","left","percent",0.75));
		
		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().back();
		
		//DRAG AND DROP 
		
		
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		Thread.sleep(1000);
        WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		Thread.sleep(1000);

		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("mobile:dragGesture",ImmutableMap.of("elementId",((RemoteWebElement)source).getId(),"endX",623,"endY",539));
		
		driver.navigate().back();
		
		// SCROLL
		
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"TextFields\"));"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
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
