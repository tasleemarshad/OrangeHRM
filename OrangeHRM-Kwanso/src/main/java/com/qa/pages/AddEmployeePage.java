package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;


public class AddEmployeePage extends TestBase{


	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']")
	WebElement PIM;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement AddEmployee;
	
	@FindBy(id ="firstName")
	WebElement FirstName;
	
	@FindBy(id="middleName")
	WebElement MiddleName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="photofile")
	WebElement Photo;
	
	@FindBy(id="chkLogin")
	WebElement CreateLogin ;
	
	@FindBy(id="user_name")
	WebElement UserName ;
	
	@FindBy(id="user_password")
	WebElement Password ;
	
	@FindBy(id="re_password")
	WebElement ConfirmPassword ;
	
	@FindBy(id="status")
	WebElement Status ;
	
	@FindBy(id="btnSave")
	WebElement SaveButton ;
	
	//Initializing the Page Objects:
	public AddEmployeePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickonPIMButton (){
	PIM.click();	
	}
	
	public void clickonAddEmployee(){
		AddEmployee.click();	
		}
	
	public void Frstname(String  fname){
	FirstName.sendKeys(fname);
		}

	public void Midlename(String midname){
		MiddleName.sendKeys(midname);	
		}
	
	public void Lstname(String lname){
		LastName.sendKeys(lname);	
		}
	
	public void SelectProfilePhoto(){
		Photo.sendKeys("C:\\Users\\LENOVO\\Desktop\\road-1072823__340.jpg");	
		}
	
	public void ClickonLoginDetail(){
		CreateLogin.click();
		}
	
	public void Usrname(String name ){
		UserName.sendKeys(name);	
		}
	public void paswrd(String password){
		Password.sendKeys(password);	
		}
	
	public void ConfrmPaswrd(String cnfrmpaswrd){
		ConfirmPassword.sendKeys(cnfrmpaswrd);	
		}
	
	public void SelectStatus( String EmpStatus){
		Select EmplyeStatus = new Select(Status);
	     EmplyeStatus.selectByValue(EmpStatus);
		}
	
	public EmployeeListPage ClickSaveBtn(){
		SaveButton.click();	
		
		return new EmployeeListPage();
		}

}
