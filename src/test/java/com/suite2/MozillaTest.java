package com.suite2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MozillaTest {
	public WebDriver driver;
	String title="";
  	String actualTitle="";
	 
	  @Test
	  public void testWebelements() {
			driver.findElement(By.id("email")).sendKeys("user123");
			driver.findElement(By.id("password")).sendKeys("password");
			driver.findElement(By.id("submit-button")).click();
	  }
	  
	  @BeforeMethod
	  public void launchBrowser() {
		  	String exepathMozilla="F:\\2018\\Mozilla\\geckodriver.exe";
			String driverMozilla="webdriver.gecko.driver";
			String URL="https://stackoverflow.com/users/login";
			System.setProperty(driverMozilla, exepathMozilla);
			//System.out.println("opening the browser");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(URL);
	  }
	 
	  @AfterMethod
	  public void terminateBrowser() {
	      driver.quit();
	 
}
}
