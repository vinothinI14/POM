package guru99;

import java.awt.AWTException;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DiscountCouponT9 {
	
	@Test
	public void saveOrder() throws InterruptedException, AWTException
	{
		String code="GURU50";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//launch URL
		driver.get("http://live.guru99.com/index.php/");
		
		//Go to mobile and add IPHONE
		driver.findElementByXPath("//a[text()='Mobile']").click();
		WebElement ele = driver.findElementByXPath("//label[text()='Sort By']/following::select");
		Select name = new Select(ele);
		name.selectByVisibleText("Name");
		
		//Click ADD to cart
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='actions']/button").click();
		
		//Enter the coupon code
		driver.findElementByXPath("//div[@class='field-wrapper']/input").sendKeys(code);
		
		driver.findElementByXPath("//div[@class='field-wrapper']/div/button/span").click();
		
		//Verify discount generated
		String dicount = driver.findElementByXPath("//div[@class='cart-totals']/table/tbody/tr[2]/td[2]/span").getText();
		if(dicount.contains("-$25.00"))
		{
			System.out.println("Discount 5% applied");
		}
		driver.close();
	}
}
