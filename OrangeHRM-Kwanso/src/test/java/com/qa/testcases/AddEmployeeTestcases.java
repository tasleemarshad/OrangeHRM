package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEmployeePage;
import com.qa.pages.DashboardPage;
import com.qa.pages.EmployeeListPage;
import com.qa.pages.LoginPage;

public class AddEmployeeTestcases extends TestBase {
	
	LoginPage lginPge;
	DashboardPage dshBrd;
	AddEmployeePage AdEmplye;
	
	
	public AddEmployeeTestcases(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new LoginPage();	
		dshBrd = new DashboardPage();
		AdEmplye = new AddEmployeePage();
	}

	
	@Test(priority=1)
	
	public void HappyPathAddEmployee() throws InterruptedException{
		EmployeeListPage.enteredFirstName  = "TEST";
		EmployeeListPage.enteredMiddleName  = "QA";
		
		dshBrd = lginPge.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		AdEmplye.clickonPIMButton();
		Thread.sleep(1000);
		AdEmplye.clickonAddEmployee();
		Thread.sleep(1000);
		AdEmplye.Frstname(EmployeeListPage.enteredFirstName);
		
		AdEmplye.Midlename(EmployeeListPage.enteredMiddleName);

		AdEmplye.Lstname("user");
		
		AdEmplye.SelectProfilePhoto();
	
		AdEmplye.ClickonLoginDetail();
		
		AdEmplye.Usrname(EmployeeListPage.enteredFirstName + " " + EmployeeListPage.enteredMiddleName);
		AdEmplye.paswrd("Abcd1234@");
		AdEmplye.ConfrmPaswrd("Abcd1234@");
		AdEmplye.SelectStatus("Enabled");
		AdEmplye.ClickSaveBtn();	

	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
}
	

}
