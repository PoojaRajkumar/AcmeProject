package com.framework.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.design.ProjectMethods;
//import com.framework.pages.HomePage;
import com.framework.pages.LoginPage;

public class TC001_Login extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Login";
		testDescription="Login to ACME Application";
		testNodes="Vendor";
		author="Pooja"; 
		category="Smoke";
		dataSheetName="DataSheet_Acme";
	}
	//String username; String password;
	@Test(dataProvider="fetchData")
	public void PrintVendor(String username,String password,String taxid) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.hoverVendor()
		.enterVendorID(taxid)
		.clickVendorSearch()
		.getVendor();

	}
}

