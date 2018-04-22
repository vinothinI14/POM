package week3;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteContact extends ProjectMethods{
@Test(dataProvider="data")
	public void contact(String comName,String fName,String lName)
	{
		
		click(locateElement("link text", "Accounts"));
		click(locateElement("link text", "Find Accounts"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		type(locateElement("xpath", "//input[@name='phoneNumber']"),"8122767497");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//img[@alt='Expire']"));
		click(locateElement("link text", "Find Accounts"));
		type(locateElement("xpath", "//label[text()='Account ID:']/following::input"),"10782");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//verifyExactText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-formatedPrimaryPhone']"), "8122767497");
		verifyExactText(locateElement("xpath", "//div[@class='x-paging-info']"), "8122767497");
		closeBrowser();
		
	}
/*@DataProvider(name="data")
public Object[][] getdata(){
	return data;
	
}*/
}
