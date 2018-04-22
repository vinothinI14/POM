package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load URL
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
		
		//Find the first name
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("v");
		
		//Click the find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//use webriver to wait until the find leads click
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))));
		
		//Click the first link of the find list
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
	
	}

}
