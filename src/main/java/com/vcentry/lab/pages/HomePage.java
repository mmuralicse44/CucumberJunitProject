package com.vcentry.lab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vcentry.lab.base.BaseClass;

import junit.framework.Assert;

public class HomePage extends BaseClass{
	WebDriver driver;
	public HomePage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//span[text()='Products']")
private WebElement title;

@FindBy(id="add-to-cart-sauce-labs-backpack")
private WebElement addBackpack;

@FindBy(id="shopping_cart_container")
private WebElement basket;



@SuppressWarnings("deprecation")
public void verifyHomePage(){
	Assert.assertTrue(elementDisplayed(title));
}
public void addBackpacktocart(){
	clickElement (addBackpack);
	clickElement (basket);
}
}