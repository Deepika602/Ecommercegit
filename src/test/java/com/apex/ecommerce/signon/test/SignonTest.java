package com.apex.ecommerce.signon.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileNotFoundException;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.order.page.OrderPage;
import com.apex.ecommerce.signon.constant.SignonConstant;
import com.apex.ecommerce.signon.page.SignonPage;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.core.*;

public class SignonTest extends ApexBaseTest implements SignonConstant {
	SignonPage signonPage;
	OrderPage orderPage;
	public static Logger log=LogManager.getLogger(SignonTest.class.getName());
	@Test
	public void testWithSuccessCredentials()
	{
		signonPage=new SignonPage(driver);
		signonPage.clickOnButton("deepika.dk1019@gmail.com", "Deepika");
		log.debug("button clicked");
		Assert.assertEquals(signonPage.validateSuccessMsg(),YOU_HAVE_LOGGED_IN_SUCCESSFULLY );
	
	}
	
	
	@Test
	public void testWithBlankUserId()
	{
		signonPage=new SignonPage(driver);
		log.info("browser opened");
		signonPage.clickOnButton(" ", "Deepika");
		log.debug("button1 clicked");
		Assert.assertEquals(signonPage.validateFailureMsg(),INVALID_USERNAME_PASSWORD );
	}
	
	@Test
	public void testWithAllBlanks()
	{
		signonPage=new SignonPage(driver);
		signonPage.clickOnButton(" ", " ");
		Assert.assertEquals(signonPage.validateFailureMsg(),INVALID_USERNAME_PASSWORD );
	}
	
	@Test
	public void testWithInvalidCharacters()
	{
		signonPage=new SignonPage(driver);
		signonPage.clickOnButton("@@@", "@@@");
		//AssertJUnit.assertEquals(signonPage.validateFailureMsg(),INVALID_USERNAME_PASSWORD );
		Assert.assertTrue(false);
	}
	
	@Test
	public void testWithWrong()
	{
		signonPage=new SignonPage(driver);
		signonPage.clickOnButton(" ", " ");
		Assert.assertEquals(signonPage.validateFailureMsg(),"valid");
	}
	
	
//	@Test
//	public void testWithSQLCertificate()
//	{
//		
//	}
	
//	@Test
//	public void testWithXSScripting()
//	{
//		
//	}

}
