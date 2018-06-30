package guru99;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class SaveOrderT7 {

	@Parameters("url")
	@Test
	
	public void saveOrder(String url) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//launch URL
		driver.get(url);

		//click on account
		driver.findElementByXPath("//span[text()='Account']").click();

		//click on login
		driver.findElementByXPath("//div[@class='links']/ul/li[6]").click();

		//Enter the email id
		driver.findElementById("email").sendKeys("Vinoma4@gmail.com");

		//Enter the password
		driver.findElementById("pass").sendKeys("vinoma");

		//Click on Login
		driver.findElementById("send2").click();
		
		//Click on my order
		driver.findElementByXPath("//div[@class='block-content']/ul/li[4]").click();
		
		//Click on view order
		driver.findElementByXPath("(//td['a-center view last'])[6]/span/a").click();
		
		/*Thread.sleep(2000);
		WebElement table = driver.findElementByXPath("//table[@class='data-table orders']");
		List<WebElement> row=table.findElements(By.tagName("tr"));
		
		List<WebElement> col=table.findElements(By.tagName("td"));
		int size = col.size();
		col.get(size).click();*/
		
		//Verify previous order displayed
		String status = driver.findElementByXPath("//div[@class='page-title title-buttons']/h1").getText();
		if(status.contains("pending"))
		{
			System.out.println("Order displayed and status is pending");
		}
		
		//Click on print order
		driver.findElementByXPath("//div[@class='page-title title-buttons']/a[2]").click();
		
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
		List<String> winlist=new ArrayList<>();
		winlist.addAll(win);
		driver.switchTo().window(winlist.get(1));
		
		//Click on save
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Save']").click();
		
		//paste it using robot class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
		
	}
}
