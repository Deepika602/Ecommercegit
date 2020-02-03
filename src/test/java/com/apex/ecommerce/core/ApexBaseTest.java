package com.apex.ecommerce.core;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseTest {
	
	public static WebDriver driver=null;
//	String url = "http://ecommerce.saipratap.net/customerlogin.php";
	protected Properties prop=null;

	
	@BeforeMethod
	protected void setUp() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/Shineys/EclipseWS/ecommerce-selenium-tests/src/test/java/com/apex/ecommerce/core/data.properties");
//		FileInputStream fis=new FileInputStream(System.getProperty("Users.dir")+"/src/test/java/com/apex/ecommerce/core/data.properties");
		
		prop.load(fis);
		
//		String browserName=System.getProperty("browser");
	String browserName=prop.getProperty("browser");
//		String url=prop.getProperty("url");
	
		if(browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver 3");
			/*headlessbrowser
			 * ChromeOptions options=new ChromeOptions();
			 * if(browserName.contains("headless")) { options.addArguments("headless"); }
			 * driver = new ChromeDriver(options);
			 */
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		else if(browserName=="firefox")
		{
			
		}
	}
	
	

	@AfterMethod
	protected void close() {
		driver.close();
	}


}
