package guru99;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import wdMethods.ProjectMethods;

public class MobilePriceT2 extends ProjectMethods{
	
	@Test
	
	public void price() throws IOException
	{
				
		//Click on mobile
		driver.findElementByXPath("//a[text()='Mobile']").click();
		
		//Sort by name
		WebElement ele=driver.findElementByXPath("//label[text()='Sort By']/following::select");
		Select name=new Select(ele);
		name.selectByVisibleText("Name");
		

		//Read the mobile price
		String price = driver.findElementById("product-price-1").getText();
		
		
		//Get the cost of sonyexperia
		driver.findElementByXPath("(//h2[@class='product-name'])[3]").click();

		//Read the price after the click the sony mobile
		String price1 = driver.findElementById("product-price-1").getText();
		
		
		//Compare the prices
		try {
		AssertJUnit.assertEquals(price,price1);
		System.out.println("price are equal");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		

		driver.close();
}
}
