package week3;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class DeleteAccount extends ProjectMethods{
	@Test
	public void delete() throws InterruptedException {
		//WebDriver driver = login1();
		click(locateElement("//a[text()='Accounts']"));
		click(locateElement("//a[text()='Find Accounts']"));
		
		type(locateElement("//label[text()='Account ID:']/following::input[2]"),"suvi");
		type(locateElement("//label[text()='Account ID:']/following::input"),"11478");
		click(locateElement("//button[text()='Find Accounts']"));
//		webDriverWait("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a]");
		
		String str = getText(locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		Thread.sleep(5000);		
		click(locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle("Account Details | opentaps CRM");
		clickWithNoSnap(locateElement("//a[text()='Deactivate Account']"));
		Thread.sleep(3000);
		/*driver.switchTo().alert();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);*/
		acceptAlert();
		String warning = locateElement("//span[@class='subSectionWarning']").getText();
		verifyExactText(locateElement("//span[@class='subSectionWarning']"), warning);
		click(locateElement("//a[text()='Find Accounts']"));
		type(locateElement("//label[text()='Account ID:']/following::input[2]"),"suvi");
		type(locateElement("//label[text()='Account ID:']/following::input"),"11478");
		click(locateElement("//button[text()='Find Accounts']"));
		String error = locateElement("//div[@class='x-paging-info']").getText();
		verifyExactText(locateElement("//div[@class='x-paging-info']"), error);
		closeBrowser();
				
	}
}














