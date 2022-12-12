package com.qa.Testscripts;


import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {

	WebDriver Driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void Setup(String Browser, String Url) throws IOException
	{
		if(Browser.equalsIgnoreCase("Chrome"))
			{
			WebDriverManager.chromedriver().setup();
			Driver=new ChromeDriver();
			}
		if(Browser.equalsIgnoreCase("Edge"))
				{	
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			  Driver=new EdgeDriver();
				}
		if(Browser.equalsIgnoreCase("Firefox"))
			{
			WebDriverManager.firefoxdriver().setup();
			Driver=new FirefoxDriver();
		}
		
//		Driver.manage().window().maximize();
		Driver.get(Url);
	}
	@AfterClass public void TearDown() throws InterruptedException{
		Thread.sleep(5000);
		Driver.close();
	}
}
