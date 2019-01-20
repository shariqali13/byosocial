package com.classplusapp.classplus;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ClassPlus {
	
	WebDriver driver;

	@BeforeTest
	public void setUp () throws InterruptedException
	 {
	
		 System.setProperty("webdriver.chrome.driver", "/Users/Koushik/Desktop/chromedriver");	 
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://classplusapp.com");
		Thread.sleep(1000);
		//driver.findElement(By.("btn btn-lg btn-danger btn-block nomargin")).click();
        
	
	 }	
	
	@Test
	
	public void titleVerify()
	
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
	}
	
}







