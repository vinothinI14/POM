package week2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class EditLeadSeM extends ProjectMethods {
	@Test
	public void edit()
	{
		/*startApp("chrome","http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
//		login();
		click(locateElement("link text", "Find Leads"));
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),"vi");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		click(locateElement("link text", "Edit"));
		clear(locateElement("id", "updateLeadForm_companyName"));
		type(locateElement("id", "updateLeadForm_companyName"),"ABCD");
		click(locateElement("class", "smallSubmit"));
		getText(locateElement("id", "viewLead_companyName_sp"));
//	    lcloseBrowser();
	}
}

