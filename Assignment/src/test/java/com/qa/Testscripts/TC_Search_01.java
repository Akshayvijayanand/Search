package com.qa.Testscripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pages.Search;

public class TC_Search_01 extends TestBase{
	
	Search search;
	@Test
	public void start() throws InterruptedException{
		search=new Search(Driver);
		search.Gsearch().sendKeys("mobile for 25000"+Keys.ENTER);
		System.out.println(search.phone.getText());
		search.Gsearch().clear();
		search.Gsearch().sendKeys("television"+Keys.ENTER);
		System.out.println(search.tv.getText());
	}

}
