package Acme;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("poojar351@gmail.com");
		driver.findElementById("password").sendKeys("poojar@25");
		driver.findElementById("buttonLogin").click();
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByXPath("//i[@class='fa fa-truck']/..")).pause(3000).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorTaxID").sendKeys("DE767565");
		driver.findElementById("buttonSearch").click();
		System.out.println(driver.findElementByXPath("//table[@class='table']//tr[2]/td").getText());
		/*List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachRow = rows.get(i);
			List<WebElement> columns = eachRow.findElements(By.tagName("td"));
			String vendor = columns.get(1).getText();
			System.out.println(vendor);
		}*/
	}
}
