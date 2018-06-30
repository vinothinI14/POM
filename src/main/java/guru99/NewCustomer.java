package guru99;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewCustomer extends Login{
	public String customerID=null;
	@Test
	public void New()
	{
		accessLogin();
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();*/
		driver.get("http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
		driver.findElementByLinkText("New Customer").click();;
		driver.findElementByXPath("//td[text()='Customer Name']/following::input").sendKeys("Vinothini kandasamy");;
		driver.findElementByXPath("//input[@name='rad1'][2]").click();
		WebElement dob = driver.findElementById("dob");
		dob.sendKeys("14041992");
		driver.findElementByName("addr").sendKeys("Thiruvanmiyur");
		driver.findElementByName("city").sendKeys("chennai");
		driver.findElementByName("state").sendKeys("Tamilnadu");
		driver.findElementByName("pinno").sendKeys("600041");
		driver.findElementByName("telephoneno").sendKeys("9087813922");
		driver.findElementByName("emailid").sendKeys("vinoma19@gmail.com");
		driver.findElementByName("password").sendKeys("VINOMA@1413");
		driver.findElementByName("sub").click();
		
		WebElement tableList = driver.findElementById("customer");
		//List<WebElement> row = tableList.findElements(By.tagName("tr"));
		List<WebElement> col = tableList.findElements(By.tagName("td"));
		System.out.println(col.size());
		String customerID=col.get(4).getText();
		System.out.println(customerID);
		//driver.close();
		
			
		
		
	}
}
