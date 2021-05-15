package pages;

import java.io.Console;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helpers.TestHelpers;
import SetUp.TestSetUp;

public class InvoicePage extends TestSetUp {
	@FindBy(xpath="//button[@type='button' and @class='btn btn-primary mr-0' ]")
	WebElement AddInvoice;
	@FindBy(xpath="//select[@id='customer_id']")
	WebElement SelectCust;
	@FindBy(xpath="//select[@id='category_id']")
	WebElement SelectCat;
	@FindBy(xpath="//input[@id='more_receipents']")
	WebElement Morereceipients;
	@FindBy(id="po_no")
	WebElement Po_No;
	@FindBy(id="invoice_no")
	WebElement Inv_no;
	@FindBy(id="invoice_date")
	WebElement Inv_date;
	@FindBy(id="invoice_amount")
	WebElement Inv_amount;
	@FindBy(xpath="//input[@id='igst' and @type='text']")
	WebElement igst;
	
	@FindBy(id="cgst")
	WebElement cgst;
	@FindBy(id="sgst")
	WebElement sgst;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement description;
	@FindBy(id="payment_term")
	WebElement pay_term;
	@FindBy(id="payment_due_date")
	WebElement pay_duedate;
	@FindBy(id="start_reminder_from")
	WebElement selectRemainder;
	@FindBy(id="reminder_frequency")
	WebElement RemainderFrequency;
	@FindBy(xpath="//label[@for='payment_status']")
	WebElement checkboxpaidinvoice;
	@FindBy(id="payment_type")
	WebElement Payment_type;
	@FindBy(xpath="//input[@id='payment_date']")
	WebElement PaymentDate;
	@FindBy(xpath="//input[@id='files' and @type='file']")
	WebElement Attachfile;
	@FindBy(xpath="//button[contains(text(), 'Cancel')]//folllowing-sibling::button")
	WebElement Submitbtn;
	@FindBy(xpath="//button[contains(text(), 'Cancel')]")
	WebElement Cancelbtn;
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	WebElement okalert;

	@FindBy(xpath="//button[@title='Download Bulk Upload Format Here!']")
	WebElement BulkUploadFormat;
	@FindBy(id="bulk_file")
	WebElement ChooseFile;
	@FindBy(xpath="//button[@title='Submit Invoice!']")
	WebElement InvSubmitbtn;
	@FindBy(className="alert alert-danger")
	WebElement Invalidinvoicealert;	
	
	@FindBy(xpath="	//button[@title='Submit Invoice!']")
	WebElement Bulkuploadsubmitbtn;	
	
	public InvoicePage() {
		PageFactory.initElements(driver, this);//initialize webelements of invoice page class 
		TestHelpers.waitforpageload(AddInvoice);//wait for load

	}
	
	
	public  void  AddInvoice( ) throws InterruptedException    {
		
		AddInvoice.click();
		TestHelpers.waitforpageload(SelectCust);//wait for load
		    Select drop = new Select(SelectCust);
		    drop.selectByIndex(1);  
		    Select catdrop = new Select(SelectCat);
		    catdrop.selectByIndex(1);
		/*    String email=randomestring()+"@gmail.com";
		    Morereceipients.sendKeys(props.getProperty(email));*/
		   Morereceipients.sendKeys(props.getProperty("MoreReceipients"));
		    Po_No.sendKeys(props.getProperty("POno"));
		    Inv_no.sendKeys(props.getProperty("Invno"));
		    Inv_date.sendKeys(props.getProperty("SelInvDt"));
		    Thread.sleep(2000);
		    Inv_amount.sendKeys(props.getProperty("Invoiceamt"));
		   

		 if (igst.isEnabled())
		  {
			 igst.sendKeys(props.getProperty("Igst"));
		  }
		  else 
		  {
			  sgst.sendKeys(props.getProperty("sgst"));
			  cgst.sendKeys(props.getProperty("cgst"));
		  }
		    description.sendKeys(props.getProperty("Desc"));
			   
			pay_term.clear();
		    pay_term.sendKeys(props.getProperty("Payterm"));
			   
		    pay_duedate.clear();
		    pay_duedate.sendKeys(props.getProperty("Selduedt"));
		    Thread.sleep(2000);

		   Select startremainder = new Select(selectRemainder);
		    startremainder.selectByIndex(1);
		    Thread.sleep(2000);

		    Select Remainfreq = new Select(RemainderFrequency);
		    Remainfreq.selectByIndex(0);
		    Thread.sleep(2000);

			TestHelpers.waitforpageload(checkboxpaidinvoice);//wait for load

		    if ( !checkboxpaidinvoice.isSelected() )
		    {
		    	checkboxpaidinvoice.click();
		    }
		    Payment_type.sendKeys(props.getProperty("paymentType"));
		    Thread.sleep(2000);

		    PaymentDate.sendKeys(props.getProperty("paydt"));
		    Thread.sleep(2000);

		     Attachfile.sendKeys(System.getProperty("user.dir")+"/src/main/resources/Report.csv");
		    Submitbtn.click();//button not working
		    
		 //   Cancelbtn.click();
				TestHelpers.waitforpageload(okalert);//wait for load

	            okalert.click();
	}



public void BulkUpload() throws InterruptedException {
	
	BulkUploadFormat.click();
	Thread.sleep(4000);
	ChooseFile.sendKeys(System.getProperty("user.dir")+"/src/main/resources/BulkUploadSample.csv");
	Thread.sleep(4000);
	Bulkuploadsubmitbtn.click();
        
}
/*public static String randomestring() {
String generatestring=RandomStringUtils.randomAlphabetic(8);
return(generatestring);
}*/

/*public static String randomeNum() {
String generatestring2=RandomStringUtils.randomNumeric(4);
return(generatestring2);
}*/
}	


	
	
	
