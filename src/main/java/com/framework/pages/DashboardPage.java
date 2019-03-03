package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class DashboardPage extends ProjectMethods {
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-truck']/..") WebElement Vendor;
	@FindBy(linkText="Search for Vendor") WebElement clickSearch;
	public VendorPage hoverVendor() {
		mouseHover(Vendor, clickSearch);
		return new VendorPage();
	}
//	
//	public VendorPage clickSearch() {
//		click(clickSearch);
//		return new VendorPage();
//		
//	}
}
