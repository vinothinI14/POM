package db;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLeadDb {

	public static void main(String[] args) {
		
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Babu");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		driver.findElementByName("submitButton").click();
		String leadName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(leadName);
		/*driver.findElement(By.)*/
		String leadID = leadName.replaceAll("\\D", "");
		System.out.println(leadID);
		
		
		DbMethods db = new DbMethods();
		db.verifyDBResults(leadID);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}