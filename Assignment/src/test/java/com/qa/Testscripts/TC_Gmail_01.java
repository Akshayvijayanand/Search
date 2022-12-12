package com.qa.Testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Gmail;

public class TC_Gmail_01 extends TestBase {

	Gmail gpage;

	@Test
	public void start() throws InterruptedException {
	System.out.println(Driver.getTitle());
	
	Driver.navigate().to("https://www.google.co.in/");
	
	
	Thread.sleep(3000);
    Gmail.signin.click();
	Thread.sleep(5000);
	Gmail.create.click();
	Thread.sleep(5000);
	Gmail.personal.click();
	Gmail.firstname.sendKeys("akshay");
	Thread.sleep(1000);
	Gmail.lastname.sendKeys("V S");
	Thread.sleep(1000);
	Gmail.username.sendKeys("akshay@123");
	Thread.sleep(1000);
	Gmail.password.sendKeys("12345678");
	Thread.sleep(1000);
	Gmail.confirm.sendKeys("12345678");
	Thread.sleep(1000);
	Gmail.checkbox.click();
	}
	
}
