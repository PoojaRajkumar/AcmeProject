package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class VendorListPage extends ProjectMethods {
	public VendorListPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class='table']//tr[2]/td") WebElement vendorName;
	public VendorListPage getVendor() {
		System.out.println(vendorName.getText());
		return this;
	}

}
