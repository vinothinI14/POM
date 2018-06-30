package guru99;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchaseT6 {
	@Test
	public void product() throws InterruptedException
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
		driver.findElementById("email").sendKeys("suvima102@gmail.com");

		//Enter the password
		driver.findElementById("pass").sendKeys("vinoma");

		//Click on Login
		driver.findElementById("send2").click();

		//Click pn wishlist
		driver.findElementByXPath("//li[@class='current']/following::a[7]").click();

		//Click on add to cart
		driver.findElementByXPath("(//div[@class='cart-cell'])[3]/button").click();

		//click on cart
		driver.findElementByXPath("//span[text()='Cart']").click();

		//Click on checkout
		driver.findElementByXPath("//div[@class='minicart-wrapper']/div[4]/ul/li/a").click();

		/*//click on add to cart
		driver.findElementByXPath("//button[@class='button btn-cart']").click();

		//Click on proceed to checkout
		driver.findElementByXPath("//span[text()='Proceed to Checkout']").click();*/

		//Enter the addresss
		driver.findElementById("billing:street1").clear();
		driver.findElementById("billing:street1").sendKeys("ABC");

		//Enter the city
		driver.findElementById("billing:city").clear();
		driver.findElementById("billing:city").sendKeys("New york");

		//Select the state
		WebElement state= driver.findElementById("billing:region_id");
		Select ele = new Select(state);
		ele.selectByVisibleText("New York");
		List<WebElement> stateOp=ele.getOptions();
		Thread.sleep(1000);
		List<WebElement> state1= driver.findElementsById("billing:region_id");
		String st[]=new String[state1.size()];
		int i=0;
		for(WebElement op:stateOp)
		{
			st[i]=op.getText();
			i++;
		}
		
		for(WebElement opt:stateOp)
		{
			for(int j=0;j<stateOp.size();j++)
			{
				if(opt.equals(st[i]))
				{
					System.out.println("Matched");
				}
				else
				{
					System.out.println("Not Matched");
				}
			}
		}
		

		//Enter the Zip
		driver.findElementById("billing:postcode").clear();
		driver.findElementById("billing:postcode").sendKeys("542896");

		//Select country
		WebElement country= driver.findElementById("billing:country_id");
		Select ele1 = new Select(country);

		ele1.selectByVisibleText("United States");

		//Enter the telephone number
		driver.findElementById("billing:telephone").clear();
		driver.findElementById("billing:telephone").sendKeys("12345678");

		//Click on continue
		driver.findElementByXPath("//span[text()='Continue']").click();

		//Verify shipping cost 
		Thread.sleep(2000);
		String cost = driver.findElementByXPath("//div[@id='checkout-shipping-method-load']/dl/dt").getText();
		if(cost.contains("Flate"))
		{
			System.out.println("Flat rate shipping of $5 is generated");
		}

		//Click on continue
		driver.findElementByXPath("(//span[text()='Continue'])[3]").click();

		//click moneyorder
		Thread.sleep(2000);
		driver.findElementByXPath("((//div[@class='fieldset'])[4]/dl/dt/input)[2]").click();

		//click on continue
		driver.findElementByXPath("(//div[@class='buttons-set'])[4]//button").click();

		//click on place order
		Thread.sleep(1000);
		driver.findElementByXPath("//button[@class='button btn-checkout']").click();

		//verify order generated and order id
		Thread.sleep(2000);
		String order = driver.findElementByClassName("page-title").getText();
		String orNum = driver.findElementByXPath("//h2[@class='sub-title']/following::p").getText();

		if(order.contains("RECEIVED")&& orNum.contains("Your order"))
		{
			System.out.println("Order is placed and order number is generated");
		}

		driver.close();

	}

}
