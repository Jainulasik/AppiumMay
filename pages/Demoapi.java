package org.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class Demoapi extends BaseClass{

	public Demoapi() {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Views")
	private WebElement views;
	public WebElement getViews() {
		return views;
	}


	@AndroidFindBy(accessibility = "Auto Complete")
	private WebElement autoComplete;
	public WebElement getAutoComplete() {
		return autoComplete;
	}


	@AndroidFindBy(accessibility = "Drag and Drop")
	private WebElement dragandDrop;
	public WebElement getDragandDrop() {
		return dragandDrop;
	}


	@AndroidFindBy(accessibility = "Expandable Lists")
	private WebElement expList;
	public WebElement getExpList() {
		return expList;
	}



	@AndroidFindBy(accessibility = "Gallery")
	private WebElement gallery;
	public WebElement getGallery() {
		return gallery;
	}

}


