package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SetUp.TestSetUp;
import pages.AllInvoicePage;
import pages.BaseClass;
import pages.BasePage;
import pages.Homepage;
import pages.InvoicePage;
import pages.LoginPage;

public class InvoicePagetest_002 extends TestSetUp {
	LoginPage loginPage;
	Homepage homePage;
	InvoicePage invoicepage;
	BasePage basepage;
	AllInvoicePage allinvoicepage;
	public InvoicePagetest_002(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		loginPage.login();
		
	}

	
	
	@Test
	public void ClickAddInvoice() throws InterruptedException{
		homePage=new Homepage();
		homePage.clickOnInvoice();
		logger.info("Invoice page is displayed");
		invoicepage=new InvoicePage();
		invoicepage.AddInvoice();
		logger.info("invoice added ");
		
	invoicepage.BulkUpload();
		logger.info("Download bulk upload file ");
		
	}
@Test
	public void verifyInvoice() throws InterruptedException {
	basepage=new BasePage(); 
	basepage.clickonReport();
	basepage.clickonAllInvoice();
	allinvoicepage=new AllInvoicePage();
	allinvoicepage.searchallinvoice();
	}
	 
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

