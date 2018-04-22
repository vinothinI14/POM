package week2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
import week4.LearnRetry;

public class CreateLeads extends ProjectMethods {
	@Test(dataProvider="data")
	public void createLead(String cName, String fName, String lName)
	{
		/*startAppWithReturn("chrome", "http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
		//login();
		click(locateElement("link text", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),cName);
		type(locateElement("id", "createLeadForm_firstName"),fName);
		type(locateElement("id", "createLeadForm_lastName"),lName);
		click(locateElement("class", "smallSubmit"));
		
	}

}
