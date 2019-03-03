package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintVendorStep {
	ChromeDriver driver;

	@Given("Open chrome broswer")
	public void openChromeBroswer() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	}

	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
	    driver.manage().window().maximize();
	}

	@Given("Set the timeout")
	public void setTheTimeout() {
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

	@Given("Enter the url")
	public void enterTheUrl() {
	    driver.get("https://acme-test.uipath.com/account/login");
	}

	@Given("Enter the username as (.*)")
	public void enterTheUsername(String email) {
	   driver.findElementById("email").sendKeys(email);
	}

	@Given("Enter the password as (.*)")
	public void enterThePassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@Given("Click on Login Button")
	public void clickOnLoginButton() {
		driver.findElementById("buttonLogin").click();
	}

	@Given("MouseHover Vendor")
	public void mousehoverVendor() {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByXPath("//i[@class='fa fa-truck']/..")).pause(3000).perform();
	}

	@Given("Click on Search For Vendor")
	public void clickOnSearchForVendor() {
		driver.findElementByLinkText("Search for Vendor").click();
	}

	@When("Enter vendor TAxID as (.*)")
	public void enterVendorTAxID(String taxid) {
		driver.findElementById("vendorTaxID").sendKeys(taxid);
	}

	@When("Click Search Button")
	public void clickSearchButton() {
		driver.findElementById("buttonSearch").click();
	}

	@Then("Print Vendor name")
	public void printVendorName() {
		System.out.println(driver.findElementByXPath("//table[@class='table']//tr[2]/td").getText());
	}



}
