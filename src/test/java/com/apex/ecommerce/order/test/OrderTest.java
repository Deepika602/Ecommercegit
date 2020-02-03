package com.apex.ecommerce.order.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.order.constant.OrderConstant;
import com.apex.ecommerce.order.page.OrderPage;
import com.apex.ecommerce.signon.page.SignonPage;

public class OrderTest extends ApexBaseTest implements OrderConstant {
	
	OrderPage orderPage;
	SignonPage signonPage;
	
	@Test
	public void validatePidTest() throws FileNotFoundException, InterruptedException
	{
		
	    signonPage=new SignonPage(driver);
	    orderPage=signonPage.goToPoductPage("deepika.dk1019@gmail.com", "Deepika");
		orderPage.productList("proid=10003",driver);
		
	}

}
