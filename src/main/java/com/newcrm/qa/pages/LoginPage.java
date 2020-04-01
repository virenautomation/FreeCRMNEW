package com.newcrm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newcrm.qa.base.TestBase;

public class LoginPage extends TestBase
{

	//Page factory or Object Repository
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
	WebElement LoginButton;
	
	@FindBy(name="email")
	WebElement UserTextBox;
	
	@FindBy(name="password")
	WebElement PassTextBox;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement LoginBtn;
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[1]/div/a/svg/image")
	WebElement FreeCRMLogo;
	
	//Initializing the Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String ValidateFreeCRMPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean ValidateFreeCRMLogo()
	{
		return FreeCRMLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pass)
	{
		LoginButton.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		UserTextBox.sendKeys(un);
		PassTextBox.sendKeys(pass);
		LoginBtn.click();
		return new HomePage();
	}
}

