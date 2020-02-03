package com.apex.ecommerce.order.page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.order.constant.OrderConstant;

public class OrderPage extends ApexBaseTest implements OrderConstant {

	

	@FindBy(linkText=PRODUCTS)
	WebElement prodLnk;
	
	@FindBy(tagName=A2)
	List<WebElement> prID;
	
	@FindBy(xpath =P_CLASS_BYLINE)
	WebElement products;
	
//	
//	@FindAll(@FindBy(how = How.XPATH, using = A_CLASS_AA2))
//	List<WebElement> allElements;
//	
	
	@FindBy(xpath =VALUE_ADD_TO_CART)
	WebElement addTocrt;
	
	@FindBy(xpath =DIV_CONTAINS_TEXT_CHECKOUT)
	WebElement chkOutBtn;
	
	@FindBy(xpath=A_HREF_PRODDETAIL_PHP_PROID_10003)
	WebElement prlnk;
	
	
	
	public OrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void productList(String prid,WebDriver driver) throws InterruptedException
	{
		prodLnk.click();
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(A_CLASS_AA2)));
		List<WebElement> lst =driver.findElements(By.xpath(A_CLASS_AA2));
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getAttribute("href").contains(prid))
			{
				lst.get(i).click();
				Thread.sleep(4000);
				addTocrt.click();
				Thread.sleep(4000);
				chkOutBtn.click();
				Thread.sleep(4000);
				break;
			}
		}
		
	}


}
