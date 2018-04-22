package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week2.LearnAnnotations;
import week5.ReadFromXl;

public class ProjectMethods extends LearnAnnotations{
	@Parameters({"username","password"})
	@BeforeMethod(groups="all")
	public WebDriver login( String username, String password)
	{
		RemoteWebDriver driver = startAppWithReturn("chrome","http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),username);
		type(locateElement("id", "password"),password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));
		return driver;
	}
	
	@AfterMethod(groups="all")
	public void closeApp()
	{
		closeBrowser();
	}
	@DataProvider(name = "data")
	public Object getdata() throws IOException {
		ReadFromXl read = new ReadFromXl();
		Object data = read.readExcel();
		
		return data;
}
}











