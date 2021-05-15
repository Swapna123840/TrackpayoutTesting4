package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.TestHelpers;
import SetUp.TestSetUp;

public class Homepage extends TestSetUp {
	
	@FindBy(xpath="//a[@href ='#/dashboard/analytics']")
	WebElement Dashboard;	
	@FindBy(xpath="//a[@href ='#/trackpayout/invoice/create' and @class='nav-link']")
	WebElement Invoice;	
	
	public Homepage() {// for whole homepage
		PageFactory.initElements(driver, this);//initialize webelements of homepage class
		TestHelpers.waitforpageload(Dashboard);//wait for load
		
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
		
	public void clickOnInvoice() {
		
		Invoice.click();
		
		//return new InvoicePage();// create object of invoicepage
	}
	
    }
	



