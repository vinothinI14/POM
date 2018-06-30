package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class ReOrderT8 {

	public void reOrder() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//launch URL
		driver.get("http://live.guru99.com/index.php/");

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
		
		//Click on reorder link
		driver.findElementByXPath("(//td['a-center view last'])[8]/span/a/following::a").click();
		
		//Get the previous order
		String preTotal = driver.findElementByXPath("//div[@class='cart-totals']/table/tfoot/tr/td/strong/span").getText();
		
		//Change QTY
		driver.findElementByXPath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/input").clear();
		driver.findElementByXPath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/input").sendKeys("10",Keys.ENTER);
		
		//Check grand total
		String grandTotal = driver.findElementByXPath("//div[@class='cart-totals']/table/tfoot/tr/td/strong/span").getText();
System.out.println(grandTotal);
		if(preTotal!=grandTotal)
		{
			System.out.println("Grand total has been changed");
		}
		else
		{
			System.out.println("Total not c0hanged");
		}

		//Proceed to checkout
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='cart-totals-wrapper']/div/ul/li/button").click();
		
	Thread.sleep(2000);
		driver.findElementByXPath("//*[@id='billing-buttons-container']/button").click();
		
		
		//Click on continue
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@id='checkout-step-shipping_method']/form/div[3]/button").click();
		
		//Select monyorder
		Thread.sleep(2000);
		driver.findElementByXPath("((//div[@class='fieldset'])[4]/dl/dt/input)[2]").click();
		driver.findElementByXPath("//div[@id='checkout-step-payment']/div/button").click();
		
		
		//Click on Place order
		Thread.sleep(1000);
		driver.findElementByXPath("//button[@class='button btn-checkout']").click();
		
		//Verify previous order displayed
		Thread.sleep(2000);
				String status = driver.findElementByXPath("//div[@class='page-title']/h1").getText();
				System.out.println(status);
				String order = driver.findElementByXPath("//div[@class='page-title']/following::p").getText();
				System.out.println(order);
				if(order.contains("Your order"))
				{
					System.out.println("Order nuber generated");
	
				}
				
				driver.close();
	}

}

