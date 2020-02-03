package com.apex.ecommerce.registration.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.registration.constant.RegistrationConstant;
import com.apex.ecommerce.registration.page.RegistrationPage;

public class RegistrationTest extends ApexBaseTest implements RegistrationConstant {
	
	RegistrationPage registration;
	
	@Test
	public void testCreateAccount() throws InterruptedException
	{
		registration=new RegistrationPage(driver);
		registration.CreateAccount("Deep1", "mothe", "09", "01", "1986", "test1@gmail.com", "4996", "344", "fremont", "CA", "US", "94555", "3312134561", "1212", "kart", "kart");
	}

}
