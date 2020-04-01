package com.newcrm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newcrm.qa.base.TestBase;
import com.newcrm.qa.pages.HomePage;
import com.newcrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void FreeCRMTitleTest()
	{
		String title = loginPage.ValidateFreeCRMPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	@Test(priority=2)
	public void FreeCRMLogoTest()
	{
		boolean flag = loginPage.ValidateFreeCRMLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void FreeCRMLoginTest()
	{
		homePage = loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
