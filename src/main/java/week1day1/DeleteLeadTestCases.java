package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLeadTestCases {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			//Load the browser
			ChromeDriver driver=new ChromeDriver();

			//Maximise the window
			driver.manage().window().maximize();

			//Open the URL
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

			//Click on phone
			driver.findElementByXPath("//span[text()='Phone']").click();
			
		    	
			
			//Enter the phone number
			/*driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("91");
			driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("044");*/
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("98");
				
			//Click on Find leads
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(1000);
			//Capture the first resulting lead
			System.out.println(driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").getText());
			Thread.sleep(1000);
			//Click on first resulting ID
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
			
			//Click delete
			driver.findElementByLinkText("Delete").click();
			
			//click find leads
			driver.findElementByLinkText("Find Leads").click();
			
			//enter the captured lead id
			driver.findElementByXPath("//input[@name='id']").sendKeys("12461");
			
			//click find leads
			driver.findElementByXPath("//button[text()='Find Leads']").click();
		//	Thread.sleep(1000);
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("x-paging-info")));
			//View error message
			System.out.println(driver.findElementByClassName("x-paging-info").getText());
			
			//close the browser
			driver.close();
			
		}

	}
