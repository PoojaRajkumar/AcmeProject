package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}


	@FindBy(how = How.ID,using="email") WebElement eleEmail;
	@FindBy(how = How.ID,using="password") WebElement elePassword;
	@FindBy(how = How.ID,using="buttonLogin") WebElement eleLogin;
	
	public LoginPage enterUsername(String data) {
		clearAndType(eleEmail, data);
		return this; 
	}
	public LoginPage enterPassword(String data) {
		clearAndType(elePassword, data);
		return this;
	}
	public DashboardPage clickLogin() {
	    click(eleLogin);
	    return new DashboardPage();
	}
	
	
}














