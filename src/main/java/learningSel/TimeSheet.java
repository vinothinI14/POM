package learningSel;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeSheet {
	@Test
	public void timeSheet()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch URL
		driver.get("https://myte.accenture.com/OGTE/secure/TimesheetPage.aspx?action=Login");
		
		//Enter the user name and password
		driver.findElementById("userNameInput").sendKeys("v.c.kandasamy");
		driver.findElementById("passwordInput").sendKeys("VINOMA@1413");
		driver.findElementById("submitButton").click();
		
		
		//Click my Time and Expense
		driver.findElementByLinkText("Enter myTimeandExpenses");
		
		
		
	}
	

}
