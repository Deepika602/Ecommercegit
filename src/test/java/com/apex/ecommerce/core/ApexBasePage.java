package com.apex.ecommerce.core;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ApexBasePage extends ApexBaseTest {
	
	public ApexBasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void getScreenShot(String testMethod) throws IOException {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/Shineys/EclipseWS/ecommerce-selenium-tests/ScreenShot/"+testMethod+timestamp()+".png"));
		
	}
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
}
