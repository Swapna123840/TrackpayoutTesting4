package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.TestHelpers;
import SetUp.TestSetUp;

public class BasePage extends TestSetUp{
	//@FindBy(xpath="//a[@href='javascript:' and @class='nav-link ng-tns-c114-20']")
	@FindBy(xpath="//span[text()='Report ']")
	WebElement ClickReport;
//	@FindBy(xpath="//a[contains(text(),' All Invoices ')]")
	@FindBy(xpath="	//a[@href='#/trackpayout/report/all']")

	WebElement AllInvoice;
	public BasePage() {
		PageFactory.initElements(driver, this);//initialize webelements of invoice page class 
	}
public void clickonReport() throws InterruptedException {
	TestHelpers.waitforpageload(ClickReport);//wait for load

	ClickReport.click();
}
public void clickonAllInvoice() throws InterruptedException {
	TestHelpers.waitforpageload(AllInvoice);//wait for load

	AllInvoice.click();

}
	}

