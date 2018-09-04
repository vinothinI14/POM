package wdMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import excel.ReadExcel;

public class ProjectMethods extends SeMethods {
	
	@Parameters({"url","username","pwd"})
	@BeforeMethod
	public void login(String url, String username, String pwd) {
		startApp("chrome", url);
		type(locateElement("id", "username"), username);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws IOException {
		ReadExcel rExcel = new ReadExcel();
		Object[][] data = rExcel.readExcel();		
		return data;		
	}
	

}