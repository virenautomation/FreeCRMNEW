package com.newcrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newcrm.qa.base.TestBase;

public class HomePage extends TestBase 
{

	//Page Factory or Object Repository
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[3]/span[1]")
	WebElement LoginTitle;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")
	WebElement ContactActivityColumn;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div")
	WebElement DealColumn;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/span[1]")
	WebElement CallQueueColumn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginTitle()
	{
		return LoginTitle.getText();
	}
	
	public boolean ValidateContactColumn()
	{
		return ContactActivityColumn.isDisplayed();
	}
	
	public boolean ValidateDealColumn()
	{
		return DealColumn.isDisplayed();
	}
	
	public boolean ValidateCallQueueColumn()
	{
		return CallQueueColumn.isDisplayed();
	}
	
}
