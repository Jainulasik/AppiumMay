package org.execute;

import java.net.MalformedURLException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pages.Demoapi;

import io.appium.java_client.AppiumBy;

public class Execute2_pageclass extends BaseClass{


	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		startServer("Nexus 5", "C:\\Users\\Lenovo\\Documents\\Appium_Test_May\\src\\test\\resources\\ApiDemos-debug.apk");
		Demoapi ap = new Demoapi();
		
		threads();
 
		
		WebElement views = ap.getViews();
		buttonClick(views);
		
		WebElement autoComplete = ap.getAutoComplete();
		buttonClick(autoComplete);
		
		WebElement dragandDrop = ap.getDragandDrop();
		buttonClick(dragandDrop);
		
		WebElement expList = ap.getExpList();
		buttonClick(expList);
		
		WebElement gallery = ap.getGallery();
		buttonClick(gallery);
		
		
		
	}
   

  
	   
}
	
	
	

