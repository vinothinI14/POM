package dailyChallenge;

	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class XpathSyn {
			
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
						   
						   driver.findElementByLinkText("Find Leads").click();
						   
						   driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("f");
						   driver.findElementByXPath("//button[text()='Find Leads']").click();
						 
						   WebDriverWait wait=new WebDriverWait(driver, 10);
						   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
						   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
						 
						   
						   

			}
			
	}

