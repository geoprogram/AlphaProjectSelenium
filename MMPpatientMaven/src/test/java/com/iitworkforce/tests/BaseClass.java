package com.iitworkforce.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass 
{

	protected WebDriver driver;

	@BeforeClass
	public void setupApplication()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver ();
		//2. Navigate to the web application
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
	}


	@AfterClass
	public void closeApplication()
	{
		driver.close();
	}



	}


