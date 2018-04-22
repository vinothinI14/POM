package week2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import wdMethods.ProjectMethods;

public class MergeAccount extends ProjectMethods{
	@Test
	public void mergeAccount(String url,String username,String password) throws InterruptedException
	{
		String err ="No records to display";
		String id1="100",id2="1003";
//		WebDriver driver = login(id2, id2, id2);
		click(locateElement("//a[text()='Accounts']"));
		click(locateElement("//a[text()='Merge Accounts']"));
		click(locateElement("(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("//label[text()='Account ID:']/following::input[1]"), id1);
		click(locateElement("//button[text()='Find Accounts']"));
		clickWithNoSnap(locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		switchToWindow(0);
		
		click(locateElement("(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("//label[text()='Account ID:']/following::input[1]"),id2);
		click(locateElement("//button[text()='Find Accounts']"));
		clickWithNoSnap(locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("//a[text()='Find Accounts']"));
		type(locateElement("//label[text()='Account ID:']/following::input"), id1);
		click(locateElement("//a[text()='Find Accounts']"));
//		String text = locateElement("//div[@class='x-paging-info']").getText();
		verifyExactText(locateElement("//div[@class='x-paging-info']"), err);
		closeBrowser();
		
		
	}
}
