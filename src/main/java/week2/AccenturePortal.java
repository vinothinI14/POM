package week2;

import org.junit.Test;

import wdMethods.SeMethods;

public class AccenturePortal extends SeMethods {
@Test
	public void portal()
	{
	//Launch URL
	startApp("chrome","https://www.google.co.in/");
	//Search content
	type(locateElement("class", "gsfi"),"Accenture portal");
	click(locateElement("xpath","//input[@value='Google Search']"));
	click(locateElement("xpath", "//h3[@class='r']/a"));
	type(locateElement("id", "userNameInput"),"v.c.kandasamy");
	type(locateElement("id", "passwordInput"),"VINOMA@1413");
	click(locateElement("id", "submitButton"));
	click(locateElement("link text", "Don't have a security code?"));
	click(locateElement("id", "vipSend"));
	type(locateElement("id", "otpInput"),"495461");
	click(locateElement("id", "vipSubmitOTP"));
	

	
	}
}