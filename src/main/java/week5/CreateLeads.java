package week5;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import wdMethods.ProjectMethods;


public class CreateLeads extends ProjectMethods {
	@Test(dataProvider = "data")
	public void createLead(String comName,String fName,String lName)
	{
		/*startAppWithReturn("chrome", "http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
		//login();
		click(locateElement("link text", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),comName);
		type(locateElement("id", "createLeadForm_firstName"),fName);
		type(locateElement("id", "createLeadForm_lastName"),lName);
		click(locateElement("class", "smallSubmit"));
		
	}
/*	public void create()
	{
		startAppWithReturn("chrome", "http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));
		//login();
		click(locateElement("link text", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),"ABcd Company");
		type(locateElement("id", "createLeadForm_firstName"),"Test Name1");
		type(locateElement("id", "createLeadForm_lastName"),"Test Last Name2");
		click(locateElement("class", "smallSubmit"));
		}
	*/
	
/*	@DataProvider(name = "data")
	public Object getdata() throws IOException {
		ReadFromXl read = new ReadFromXl();
		Object data = read.readExcel();
		
		return data;
		*/
		
	}

