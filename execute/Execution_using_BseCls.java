package org.execute;

import java.net.MalformedURLException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Execution_using_BseCls extends BaseClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		startServer("Nexus 5", "C:\\Users\\Lenovo\\Documents\\Appium_Test_May\\src\\test\\resources\\ApiDemos-debug.apk");

		
		WebElement view = driver.findElement(AppiumBy.accessibilityId("Views"));
		buttonClick(view);

		WebElement chrono = driver.findElement(AppiumBy.accessibilityId("Chronometer"));
		buttonClick(chrono);

		threads();
		WebElement start = driver.findElement(AppiumBy.accessibilityId("Start"));
		buttonClick(start);

		WebElement stopp = driver.findElement(AppiumBy.accessibilityId("Stop"));
		buttonClick(stopp);


		backforward("back");

		WebElement gallery = driver.findElement(AppiumBy.accessibilityId("Gallery"));
		buttonClick(gallery);

		WebElement phots = driver.findElement(AppiumBy.accessibilityId("1. Photos"));
		buttonClick(phots);


		WebElement image = driver.findElement(By.xpath("//android.widget.Gallery[@resource-id=\\\"io.appium.android.apis:id/gallery\\\"]/android.widget.ImageView[1]"));

		swipe(image, "left", 0.75);
	}




}

