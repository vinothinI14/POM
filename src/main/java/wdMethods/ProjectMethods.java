package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import guru99.ReadFromExcel;
import week2.LearnAnnotations;
import week5.ReadFromXl;

public class ProjectMethods extends LearnAnnotations{
	
	@BeforeMethod
	public WebDriver login()
	{
		String url="http://live.guru99.com/index.php/";
		RemoteWebDriver driver = startAppWithReturn("chrome",url);
		/*type(locateElement("id", "username"),username);
		type(locateElement("id", "password"),password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link text", "CRM/SFA"));
		click(locateElement("link text", "Leads"));*/
		return driver;
	}
	
	@AfterMethod
	public void closeApp()
	{
		closeBrowser();
	}
	@DataProvider(name = "fetchData")
	public Object getdata() throws IOException {
		ReadFromExcel read = new ReadFromExcel();
		Object data = read.data();
		
		return data;
}
}











