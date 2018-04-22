package week2;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class GmailSeM extends SeMethods{
	@Test
	public void gmail()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "https://www.google.com/gmail/about/#");
		click(locateElement("link text", "CREATE AN ACCOUNT"));
		switchToWindow(1);
		type(locateElement("id", "FirstName"),"vinoma");
		type(locateElement("LastName"),"kandu");
		type(locateElement("GmailAddress"),"vinomakandu");
		type(locateElement("Passwd"),"VINOMA@1413");
		type(locateElement("PasswdAgain"),"VINOMA@1413");
		WebElement month = driver.findElementByXPath("//div[@title='Birthday']");
		selectDropDownUsingIndex(month, 3);
		type(locateElement("birthday-placeholder"),"14");
		type(locateElement("BirthYear"),"1992");
		WebElement gender = driver.findElementByXPath("//div[@class='goog-inline-block goog-flat-menu-button jfk-select goog-flat-menu-button-hover']");
		selectDropDownUsingIndex(gender, 0);
		type(locateElement("RecoveryEmailAddress"),"vinothinik1492@gmail.com");
		WebElement country = driver.findElementByXPath("//div[@id='CountryCode']");
		selectDropDownUsingText(country, "India");
	}
}
