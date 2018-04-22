package guru99;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Login extends SeMethods {
	@BeforeMethod
	public void accessLogin()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "http://www.demo.guru99.com/V4/");
		type(locateElement("xpath", "//input[@name='uid']"),"mngr125873");
		type(locateElement("xpath", "//input[@name='password']"),"zetUver");
		click(locateElement("xpath", "//input[@name='btnLogin']"));
	}
	@AfterMethod
	public void closeApp()
	{
		closeBrowser();
	}
}
