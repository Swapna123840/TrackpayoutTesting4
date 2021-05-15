package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.TestHelpers;

public class AllInvoicePage extends BasePage  {
@FindBy(xpath="//input[@placeholder='Search here']")
		WebElement searchbtn;
@FindBy(xpath="//input[@placeholder='From Date']")
WebElement Fromdt;
@FindBy(xpath="//input[@placeholder='To Date']")
WebElement Todt;
public AllInvoicePage() {
	PageFactory.initElements(driver, this);//initialize webelements of invoice page class 
}
	public void searchallinvoice() throws InterruptedException {
TestHelpers.waitforpageload(Fromdt);//wait for load
		Fromdt.sendKeys("05052021");//not work*/
		//Thread.sleep(5000);
		//TestHelpers.waitforpageload(Todt);//wait for load

		Todt.sendKeys("05142021");//not work
		//Thread.sleep(5000);
	//	searchbtn.click();
		searchbtn.sendKeys("abcd");//not work
		Thread.sleep(5000);
	}
	

}
	

