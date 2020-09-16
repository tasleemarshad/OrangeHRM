package com.qa.testcases;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddEmployeePage;
import com.qa.pages.DashboardPage;
import com.qa.pages.EmployeeListPage;
import com.qa.pages.LoginPage;

public class EmployeeListTestCase extends TestBase {
	
	LoginPage lginPge;
	DashboardPage dshBrd;
	AddEmployeePage AdEmplye;
	EmployeeListPage EmplyLst;
	
	
	
	public EmployeeListTestCase(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new LoginPage();	
		dshBrd = new DashboardPage();
		AdEmplye = new AddEmployeePage();
		EmplyLst = new EmployeeListPage();
		dshBrd = lginPge.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void VerifyEmployeeNameInListAndDeleteIt() throws InterruptedException{
		EmplyLst.clickonPIMButton();
		EmplyLst.clickonEmplyListButton();
		Thread.sleep(2000);

		System.out.println(EmployeeListPage.enteredFirstName + " <> " + EmployeeListPage.enteredMiddleName);
		int index = 0;
		for (int i = 1; i < 30; i++) {
			WebElement usename = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+i+"]/td[3]/a"));
			System.out.println(">>>>>>>>Employee Name:: "+usename.getText());
			
			if(usename.getText().equalsIgnoreCase(EmployeeListPage.enteredFirstName + " " + EmployeeListPage.enteredMiddleName)){
				index = i;
				assertTrue(true);				
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+index+"]/td[1]")).click();
		EmplyLst.clickonDeleteBtn();
		EmplyLst.clickonDeleteBtn();
	
	}
	
	@AfterMethod
	public void tearDown(){
//		driver.quit();
}
	
	
}
