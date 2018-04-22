package guru99;

import org.testng.annotations.Test;

public class EditCustomer extends Login {
	@Test
	public void edit()
	{
		//accessLogin();
		click(locateElement("link text", "Edit Customer"));
		type(locateElement("name", "cusid"),"17011");
		click(locateElement("name", "AccSubmit"));
		locateElement("name", "telephoneno").clear();
		type(locateElement("name", "telephoneno"),"8787585785");
		click(locateElement("name", "sub"));
	}
}
