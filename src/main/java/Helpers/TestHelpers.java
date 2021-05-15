package Helpers;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetUp.TestSetUp;

//public class TestHelpers {
public class TestHelpers extends TestSetUp {
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	
	public static void waitforpageload(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, PAGE_LOAD_TIMEOUT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}


