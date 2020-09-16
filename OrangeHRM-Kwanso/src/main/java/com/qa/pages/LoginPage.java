package com.qa.pages;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.qa.base.TestBase;
	import com.qa.pages.DashboardPage;

	public class LoginPage extends TestBase {
		
//		Page Factory
		
		@FindBy(id="txtUsername")
		WebElement username;
		
		@FindBy(id="txtPassword")
		WebElement password;
		
		@FindBy(id="btnLogin")
		WebElement LoginButton;
		
		//Initializing the Page Objects:
			public LoginPage(){
				PageFactory.initElements(driver, this);
			}
			
			public DashboardPage login(String un, String pwd){
				username.sendKeys(un);
				password.sendKeys(pwd);
				LoginButton.click();
				
				    	
				return new DashboardPage();
			}

	}



