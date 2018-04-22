package week3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class DeactivateAccount extends ProjectMethods{
	@Test(dataProvider="data1")
	public void deactivae(String fName,String AcId,String name,String id)
	{
		//login(null, null, null);
		click(locateElement("link text", "Accounts"));
		click(locateElement("link text", "Find Accounts"));
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input[2]"),"VinoSuvi");
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input"),"10782");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle("Account Details | opentaps CRM");
		clickWithNoSnap(locateElement("link text","Deactivate Account"));
		String alert = getAlertText();
		acceptAlert();
		verifyPartialText(locateElement("xpath", "//span[@class='subSectionWarning']"), "This account was deactivated as of 3/29/18 15:25:08");
		click(locateElement("link text", "Find Accounts"));
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input[2]"),"VinoSuvi");
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input"),"10782");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		String err="No rexords to display";
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), err);
		closeBrowser();
	}
	@DataProvider(name="data1")
	public Object dataprovider()
	{
		Object[][] data=new Object[1][4];
		
		data[0][1]="Vinosuvi";
		data[0][1]="10872";
		data[0][1]="Vinosuvi";
		data[0][1]="10872";
		return data;
		
	}
}
