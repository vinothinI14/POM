package week3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import wdMethods.ProjectMethods;

public class TestCaseAccount extends ProjectMethods{
	@Test
	public void create()
	{
String str="Vinothini Kandasamy";
//		WebDriver driver = login();
		click(locateElement("link text", "Accounts"));
		click(locateElement("link text", "Create Account"));
		type(locateElement("xpath", "//span[text()='Account Name']/following::input"),str);
		selectDropDownUsingIndex(locateElement("xpath", "//select[@name='industryEnumId']"), 2);
		selectDropDownUsingText(locateElement("currencyUomId"), "INR - Indian Rupee");
		selectDropDownUsingIndex(locateElement("dataSourceId"), 4);
		selectDropDownUsingText(locateElement("marketingCampaignId"), "Car and Driver");
		type(locateElement("primaryPhoneNumber"),"8122767497");
		type(locateElement("generalCity"),"Chennai");;
		type(locateElement("primaryEmail"),"vinoma@gmail.com");;
		selectDropDownUsingText(locateElement("generalCountryGeoId"), "India");
		selectDropDownUsingText(locateElement("generalStateProvinceGeoId"), "TAMILNADU");
		click(locateElement("class", "smallSubmit"));
		String accountID = getText(locateElement("xpath", "//span[text()='Account Name']/following::span"));
		
		click(locateElement("link text", "Find Accounts"));
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input[2]"),str);
		//type(locateElement("xpath", "//label[text()='Account ID:']/following::input"),accountID);
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
	
		String err ="Displaying records";
		
		verifyExactText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-groupName']"), str);
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), err);
		closeBrowser();
		
	}
}
