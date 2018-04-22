package guru99;

import org.testng.annotations.Test;

public class DeleteCustomer extends Login{
@Test
	public void delete()
	{
		click(locateElement("link text", "Delete Customer"));
		type(locateElement("xpath", "//td[text()=\"Customer ID\"]/following::input"), "27294");
		click(locateElement("name", "AccSubmit"));
		acceptAlert();
		
	}
}
