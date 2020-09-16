package com.qa.testcases;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;

public class LoginTestcases extends TestBase {
	
	LoginPage lginPge;
	DashboardPage dshBrd;
	
	public LoginTestcases(){
		super();
	}
	 
	@BeforeTest
	public void setUp(){
		initialization();
		lginPge = new LoginPage();	
	}

	
	@Test(priority=1)
	public void loginTest(){
		dshBrd = lginPge.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@AfterTest
	public void tearDown(){
		driver.quit();
}
	
}
