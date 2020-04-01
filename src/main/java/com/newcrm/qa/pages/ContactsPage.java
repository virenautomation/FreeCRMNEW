package com.newcrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newcrm.qa.base.TestBase;

public class ContactsPage extends TestBase
{
	
	//Page Factory
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]")
	WebElement ContactLink;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement NewContactLink;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement FirstNameTextbox;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/input")
	WebElement LastNameTextbox;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement CompanyNameTextbox;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement SaveBtn;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateContactlink()
	{
		return ContactLink.isEnabled();
	}
	
	public boolean ValidateNewContactLink()
	{
		return NewContactLink.isEnabled();
	}
	
	public void ValidateNewContact()
	{
		FirstNameTextbox.sendKeys("Viru");
		LastNameTextbox.sendKeys("Singh");
		CompanyNameTextbox.sendKeys("NIIT");
		SaveBtn.click();
	}	
}
