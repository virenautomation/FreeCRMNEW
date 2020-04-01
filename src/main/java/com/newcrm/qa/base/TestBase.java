package com.newcrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;

		public TestBase()
		{
			try
			{
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:\\Users\\Viren\\eclipse-workspace\\FreeCRMNew\\src\\main\\java\\com\\newcrm\\qa\\config\\config.prop");
				prop.load(ip);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			}
		
		public static void initialization()
		{
			String browserName = prop.getProperty("browser");
			if (browserName.equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if (browserName.equals("IE"))
			{
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("URL"));
			
		}
}
