package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	WebDriver Driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	 WebElement Gsearch;
	public WebElement Gsearch(){
		return Gsearch;
	}

	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]")
	public static WebElement phone;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]")
	public static WebElement tv;

public Search(WebDriver Driver) {
	this.Driver=Driver;
	PageFactory.initElements(Driver, this);
}
}