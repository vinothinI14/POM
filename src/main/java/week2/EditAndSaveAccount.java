package week2;

import org.junit.Test;

import wdMethods.ProjectMethods;

public class EditAndSaveAccount extends ProjectMethods{
@Test
	public void edit(String url,String username,String password)
	{
		
		//login();
		click(locateElement("link text", "Accounts"));
		click(locateElement("link text", "Find Accounts"));
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input[2]"),"VinoSuvi");
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input"),"10782");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle("Edit Account | opentaps CRM");
		click(locateElement("link text", "Edit"));
		locateElement("accountName").clear();
		type(locateElement("accountName"),"Suviksha");
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		verifyExactText(locateElement("xpath", "//span[text()='Account Name']/following::span"), "Suviksha");
		closeBrowser();
		
	}
}

