package week2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;
/*import wdMethods.SeMethods;*/

public class DuplicateSeM extends ProjectMethods {
	
@Test/*(groups="sanity")*/
	public void duplicate() throws InterruptedException 
	{
		/*startApp("chrome","http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager	");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
//	    login();
		click(locateElement("link text", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("xpath", "//input[@name='emailAddress']"),"ab");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		String name = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		click(locateElement("link text", "Duplicate Lead"));
		getTitle();
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		String fname = getText(locateElement("id","viewLead_firstName_sp"));
				
		if(fname.equalsIgnoreCase(name))
		{
			System.out.println("Duplicated Lead Name is same as captured name"+name+ fname);
		}
		Thread.sleep(2000);
//		closeBrowser();

	}
}
