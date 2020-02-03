package com.apex.ecommerce.registration.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.registration.constant.RegistrationConstant;

public class RegistrationPage extends ApexBaseTest implements RegistrationConstant {
	@FindBy(name = FNAME)
	WebElement fName;

	@FindBy(name = LNAME)
	WebElement lName;

	@FindBy(name = DAY)
	WebElement dy;

	@FindBy(name = MONTH)
	WebElement mn;

	@FindBy(name = YEAR)
	WebElement yr;

	@FindBy(name = EMAIL)
	WebElement emailId;

	@FindBy(name = HOUSENO)
	WebElement hsNo;

	@FindBy(name = ADD1)
	WebElement address1;

	@FindBy(name = CITY)
	WebElement cty;

	@FindBy(name = STATE)
	WebElement stat;

	@FindBy(name = COUNTRY)
	WebElement cntry;

	@FindBy(name = POSTCODE)
	WebElement pstcode;

	@FindBy(name = FAX)
	WebElement fx;

	@FindBy(name = PASSWORD2)
	WebElement pwd;

	@FindBy(name = CPASSWORD)
	WebElement cpwd;

	@FindBy(name = TERMS)
	WebElement trms;
	
	@FindBy(name = PHONE)
	WebElement phne;
	
	@FindBy(name = SUBMIT)
	WebElement submitBtn;
	
	@FindBy(linkText=SIGN_UP)
	WebElement signUpBtn;
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CreateAccount(String fname,String lname,String day,String month,String year,String email,String houseno,String ad1,String city
			,String state,String country,String Postcode,String phone,String fax,String password,String cpassword) throws InterruptedException
	{
		
		signUpBtn.click();
		Thread.sleep(2000);
		
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		dy.sendKeys(day);
		mn.sendKeys(month);
		yr.sendKeys(year);
		emailId.sendKeys(email);
		hsNo.sendKeys(houseno);
		address1.sendKeys(ad1);
		cty.sendKeys(city);
		stat.sendKeys(state);
		cntry.sendKeys(country);
		pstcode.sendKeys(Postcode);
		phne.sendKeys(phone);
		fx.sendKeys(fax);
		pwd.sendKeys(password);
		cpwd.sendKeys(cpassword);
		trms.click();
		submitBtn.click();
		
	}
	

}
