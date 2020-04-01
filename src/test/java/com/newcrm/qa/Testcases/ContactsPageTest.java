package com.newcrm.qa.Testcases;

import org.testng.annotations.BeforeTest;

import com.newcrm.qa.base.TestBase;
import com.newcrm.qa.pages.HomePage;
import com.newcrm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage contactPage;
	
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeTest
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		contactPage = loginPage.login(prop.getProperty("UserName"),prop.getProperty("Password"));
	}
	
	@Test
	public void ContactLinkTest()
	{
		
	}
	
}
