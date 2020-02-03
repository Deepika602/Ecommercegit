package com.apex.ecommerce.signon.page;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.order.page.OrderPage;
import com.apex.ecommerce.signon.constant.SignonConstant;


public class SignonPage extends ApexBaseTest implements SignonConstant {
	
	 
	OrderPage orderPage;
	@FindBy(name=Email_Name_LOCATOR)
	WebElement emailID;
	
	@FindBy(name=PWD_Name_LOCATOR)
	WebElement pwdEleme;
	
	@FindBy(linkText=LOGIN_BTN_LINK_TEXT_LOCATOR)
	WebElement lnkBtn ;
	
	@FindBy(xpath=DIV_CLASS_FNTSTYLE)
	WebElement successTxt;
	
	@FindBy(xpath=SPAN_CLASS_MSG)
	WebElement failureTxt;
	

	@FindBy(xpath=A_CONTAINS_TEXT_PRODUCTS)
	WebElement prodLnk;
	
	public SignonPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnButton(String loginId,String pwd)
	{
		emailID.sendKeys(loginId);
		pwdEleme.sendKeys(pwd);
		lnkBtn.click();
	}
	
	public String validateSuccessMsg()
	{
		return successTxt.getText();
	}
	
	public String validateFailureMsg()
	{
		return failureTxt.getText();
	}
	

	public OrderPage goToPoductPage(String loginId,String pwd) throws FileNotFoundException, InterruptedException
	{
		emailID.sendKeys(loginId);
		pwdEleme.sendKeys(pwd);
		lnkBtn.click();
		Thread.sleep(3000);
//		prodLnk.click();

		return new OrderPage(driver);
		
	}
}
