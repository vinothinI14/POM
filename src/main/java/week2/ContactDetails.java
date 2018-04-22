package week2;

import org.junit.Test;

import wdMethods.ProjectMethods;

public class ContactDetails extends ProjectMethods{
@Test
	public void contact()
	{
//	 	login(null, null, null);

	 	click(locateElement("link text", "Contacts"));
	 	click(locateElement("link text", "Create Contact"));
	 	type(locateElement("firstNameField"),"Vinothini");
	 	type(locateElement("lastNameField"),"Kandasamy");
	 	
	 	type(locateElement("createContactForm_firstNameLocal"),"Vino");
	 	type(locateElement("createContactForm_lastNameLocal"),"Kandhu");
	 	
	 	type(locateElement("createContactForm_personalTitle"),"Miss");
	 	type(locateElement("createContactForm_generalProfTitle"),"Good person");
	 	type(locateElement("createContactForm_departmentName"),"CSE");
	 	
	 	selectDropDownUsingText(locateElement("createContactForm_preferredCurrencyUomId"), "INR - Indian Rupee");
	 	
	 	
	 	type(locateElement("createContactForm_description"),"Very noughty and cool person");
	 	type(locateElement("createContactForm_importantNote"),"Smart worker");
	 	
	 	type(locateElement("createContactForm_primaryPhoneCountryCode"),"91");
	 	type(locateElement("createContactForm_primaryPhoneAreaCode"),"1");
	 	type(locateElement("createContactForm_primaryPhoneAreaCode"),"44");
	 	type(locateElement("createContactForm_primaryPhoneNumber"),"8122767497");
	 	type(locateElement("createContactForm_primaryPhoneAskForName"),"Important only");
	 	
	 	type(locateElement("generalToNameField"),"Vinoma");
	 	type(locateElement("createContactForm_generalAttnName"),"Vino");
	 	type(locateElement("createContactForm_generalAddress1"),"Rathnam nagar");
	 	type(locateElement("createContactForm_generalAddress2"),"Thiruvanmiyur");
	 	type(locateElement("createContactForm_generalCity"),"Chennai");
	 	
	 	selectDropDownUsingText(locateElement("createContactForm_generalStateProvinceGeoId"), "Indiana");
	 	type(locateElement("createContactForm_generalPostalCode"),"600041");
	 	
	 	selectDropDownUsingText(locateElement("createContactForm_generalCountryGeoId"), "India");
	 	type(locateElement("createContactForm_generalPostalCodeExt"),"41");
	 	click(locateElement("xpath", "//input[@class='smallSubmit']"));
	 	closeBrowser();
	}
}
