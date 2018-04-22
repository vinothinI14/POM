package week3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import wdMethods.ProjectMethods;

public class MergeAccount extends ProjectMethods{
	@Test
	public void mergeAccount() throws InterruptedException
	{
		String err ="No records to display";
		String id1="100",id2="100";
//		WebDriver driver = login();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		
		click(locateElement("xpath","//a[text()='Merge Accounts']"));
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"), id1);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		clickWithNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		switchToWindow(0);
		
		click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),id2);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		clickWithNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("xpath","//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input"), id1);
		click(locateElement("xpath","//a[text()='Find Accounts']"));
//		String text = locateElement("//div[@class='x-paging-info']").getText();
		verifyExactText(locateElement("xpath","//div[@class='x-paging-info']"), err);
		closeBrowser();
		
		
	}
}
