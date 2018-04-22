package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLeadTestCase {

	private static final int OutputType = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Load the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Open the Url
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		//Enter the User Name
				driver.findElementById("username").sendKeys("Demosalesmanager");
				
				//Enter the Password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//Click the login
				driver.findElementByClassName("decorativeSubmit").click();
				
				//Click Crmsfa
				driver.findElementById("label").click();
						
		//Click Leads
		driver.findElementByLinkText("Leads").click();
				
		//click Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		
		//Find the label id bcoz no locator available in parent of input textbox 2
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("v");
		
		//Click the find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))));
		
		//Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		//verify the title of the page
		System.out.println("The title of this page is" + driver.getTitle());
		
		//Click on edit
		driver.findElementByLinkText("Edit").click();
				
		//Change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Accenture");
		
		//driver.getScreenshotAs(arg0)
		
		
		//Change the fore name and surname
		driver.findElementById("updateLeadForm_firstName").clear();
		driver.findElementById("updateLeadForm_firstName").sendKeys("Vino");
		
		driver.findElementById("updateLeadForm_lastName").clear();
		driver.findElementById("updateLeadForm_lastName").sendKeys("Vino");
		//click update
		driver.findElementByClassName("smallSubmit").click();
		
		Thread.sleep(2000);
	driver.close();
	
		
		
		

	}


}
