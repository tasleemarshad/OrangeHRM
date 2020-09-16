package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class EmployeeListPage extends TestBase{

//	Click on Menu and moves on EmployeeList Screen
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']")
	WebElement PIM;
	
	@FindBy(xpath="//*[@id='menu_pim_viewEmployeeList']")
	WebElement EmployeeList;

//	verify the EmployeeListName	
	@FindBy(name= "chkSelectRow[]")
	static WebElement username;
	
// Delete the Employename in List
	@FindBy(name="chkSelectRow[]")
	WebElement SelectCheckList ;
	
	@FindBy(name="btnDelete")
	WebElement DeleteBtn ;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement OkBtn ;
	
	public static String enteredFirstName;
	public static String enteredMiddleName;
	
//Initalize the PageFactory
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	Action
	
	public void clickonPIMButton (){
		PIM.click();	
		}
	
	public void clickonEmplyListButton (){
		EmployeeList.click();	
		}
	
	public void verifyEmployeeName(String name){
//		return username.isDisplayed();
		username.getAttribute(name);
	}
	
	public void clickonEmplycheck (){
		SelectCheckList.click();	
		}

	public void clickonDeleteBtn(){
		DeleteBtn.click();	
		}

	public void clickonOKBtn(){
		OkBtn.click();	
		}
	
	
}
