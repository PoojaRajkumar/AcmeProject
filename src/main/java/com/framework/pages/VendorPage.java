package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class VendorPage extends ProjectMethods {
	public VendorPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="vendorTaxID") WebElement vendorID;
	@FindBy(id="buttonSearch") WebElement Search;
	
	public VendorPage enterVendorID(String data) {
		clearAndType(vendorID, data);
		return this;
	}
	public VendorListPage clickVendorSearch() {
		click(Search);
		return new VendorListPage();
	}
	

}
