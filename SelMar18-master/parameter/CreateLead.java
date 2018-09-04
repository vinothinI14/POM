package parameter;


import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{	
	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName, String eMail, String ph) {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), eMail);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ph);
		click(locateElement("name", "submitButton"));
	}
	
	
	
	
	
}












