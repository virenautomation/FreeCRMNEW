package com.newcrm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newcrm.qa.base.TestBase;
import com.newcrm.qa.pages.HomePage;
import com.newcrm.qa.pages.LoginPage;

public class HomePageTest extends TestBase
{
	HomePage homePage;	
	LoginPage loginPage;

	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void LoginTitleTest()
	{
		String title = homePage.ValidateLoginTitle();
		Assert.assertEquals(title, "Viren Kumar");
	}
	
	@Test(priority=2)
	public void FirstColumnTest()
	{
		boolean first = homePage.ValidateContactColumn();
		Assert.assertTrue(first, "Contacts activity stream");
	}
	
	@Test(priority=3)
	public void SecondColumnTest()
	{
		boolean second = homePage.ValidateDealColumn();
		Assert.assertTrue(second);
	}
	
	@Test(priority=4)
	public void ThirdColumnTest()
	{
		boolean third = homePage.ValidateCallQueueColumn();
		Assert.assertTrue(third);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
	
