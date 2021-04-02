package com.qa.Swaag.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class WithoutFramework {



	@Test 
	public static void loginTest() {
		
		// setting the property 
		System.setProperty("webdriver.chrome.driver", "chromedriver 3");
		
		 // creating the object of WebDriver interface
		
	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user"); // setting up the user name 
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // putting the password
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); // clicking the login button 
			
		/*
		 * try { // this is not necessary, however just wanted to see if it
		 * interrupts
		 * 
		 * Thread.sleep(2000); // only to show you the login // } // catch
		 * (InterruptedException e) {
		 * 
		 *  }
		 */			
		driver.quit();  // quitting the WebDriver instances

		}

		}







