package week2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class DeleteSeM extends ProjectMethods {
	@Test/*(groups="sanity",dependsOnGroups="smoke")*/
	public void delete() throws InterruptedException
	{
		/*startApp("chrome","http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager	");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
		//login();
		click(locateElement("link text", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		type(locateElement("xpath", "//input[@name='phoneNumber']"),"96");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		webDriverWait("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
		String str = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		click(locateElement("link text", "Delete"));
		click(locateElement("link text", "Find Leads"));
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input"),str);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		click(locateElement("xpath", "//div[@class='x-paging-info']"));
		getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		//closeBrowser();
}
}

