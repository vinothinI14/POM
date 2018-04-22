package week2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MergeLeadSeM extends ProjectMethods{
	@Test/*(groups="sanity",dependsOnGroups="smoke")*/
	public void merge() throws InterruptedException
	{
		/*startApp("chrome","http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
//login();
		click(locateElement("link text", "Merge Leads"));
		
		click(locateElement("xpath", "//input[@id='ComboBox_partyIdFrom']/following::img"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"),"103");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		/*Thread.sleep(2000);*/
		webDriverWait("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String Str = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		
		switchToWindow(0);
		
		click(locateElement("xpath", "//input[@id='ComboBox_partyIdFrom']/following::img[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"),"104");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		/*Thread.sleep(2000);*/
		webDriverWait("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		
		clickWithNoSnap(locateElement("link text", "Merge"));
		Thread.sleep(1000);
		
		acceptAlert();
				
		click(locateElement("link text", "Find Leads"));
		/*Thread.sleep(1000);*/
		webDriverWait("//label[text()='Lead ID:']/following::input");
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input"),Str);
		click(locateElement("link text", "Find Leads"));
		
//		closeBrowser();
		
	}
}
