package dailyChallenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassWork {

	
	public static void main(String args[])
	
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Open browser
		
		ChromeDriver driver= new ChromeDriver();
		
		//Maximize the screen
				
				driver.manage().window().maximize();
		
		//Lunch the url
				driver.get("http://www.leaftaps.com/opentaps");
	
		//Enter username
				
				driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter password
				driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on login
				//driver.findElementByclassName("decorativeSubmit").click();
				   driver.findElementByClassName("decorativeSubmit").click();
				   
				   //lunch crmsfa url
				   driver.findElementById("label").click();
				   
				   driver.findElementByLinkText("Leads").click();
				   
				   driver.findElementByLinkText("Create Lead").click();
				   
				   driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
				   
				   driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
				   
				   driver.findElementById("createLeadForm_lastName").sendKeys("crmsfa");
				   
				   //driver.findElementByClassName("smallSubmit").click();
				   
				   //Select Dropd down
				   driver.findElementById("createLeadForm_dataSourceId");
				   WebElement securityQ = driver.findElementById("createLeadForm_dataSourceId");
				   
				   Select dd = new Select(securityQ);
				   //identify the element
				   //create object for select class
				   dd.selectByVisibleText("Cold Call");
				   //call the method
				   
				   
				    driver.findElementById("createLeadForm_marketingCampaignId");
				    WebElement securityq1=driver.findElementById("createLeadForm_marketingCampaignId");
				   
				   Select dd1 = new Select(securityq1);
				   List<WebElement> options = dd1.getOptions();
				   
				   System.out.println(options.size());
				  dd1.selectByIndex(options.size()-2);
				   
				   
				   
				
				
	}

}