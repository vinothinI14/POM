package guru99;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EmailsT10 {

	@Test
	public void eMail() throws InterruptedException
	{

		String id = "user01";
		String pass = "guru99com";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		
		//Launch the URL
		driver.get("http://live.guru99.com/index.php/backendlogin");

		//Enter the Back end credential
		driver.findElementByXPath("//div[@class='input-box input-left']/input").sendKeys(id);
		driver.findElementByXPath("//div[@class='input-box input-right']/input[2]").sendKeys(pass);
		
		//Click on login
		driver.findElementByXPath("//div[@class='form-buttons']/input").click();
		
		//click on close button
		driver.findElementByXPath("//div[@class='message-popup-head']/a").click();
		
		//Click sales and click order
		
		/*WebElement ele = driver.findElementByXPath("//ul[@id='nav']/li[1]");
		WebElement order = driver.findElementByXPath("//ul[@id='nav']/li/ul/li/a/span");
		Actions builder= new Actions(driver);		
		builder.moveToElement(ele).click().perform();
		builder.click(order).perform();*/
		driver.findElementByLinkText("Sales").click();
		driver.findElementByLinkText("Orders").click();
		
		
		//select CSV 
		WebElement element = driver.findElementByXPath("//div[@id='sales_order_grid']/table/tbody/tr/td[2]/select");
		Select export=new Select(element);
		export.selectByVisibleText("CSV");
		
		//Click on export button
		driver.findElementByXPath("//div[@id='sales_order_grid']/table/tbody/tr/td[2]/button").click();
		
		//Display all order information
		WebElement orderInfo = driver.findElementByXPath("//div[@class='grid']/div/table/tbody");
		List<WebElement> row = orderInfo.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		for(int i=0;i<row.size();i++)
		{
			 
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			for(WebElement column:col)
			{
				
			System.out.print(column.getText()+"\t");
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		driver.close();
		
	}

}

