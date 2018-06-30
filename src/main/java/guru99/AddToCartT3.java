package guru99;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import wdMethods.ProjectMethods;

public class AddToCartT3 extends ProjectMethods{
	
	@Test
	
	public void cart() throws IOException
	{
		
		
		//Click on mobile
		driver.findElementByXPath("//a[text()='Mobile']").click();
		
		//Sort by name
		WebElement ele=driver.findElementByXPath("//label[text()='Sort By']/following::select");
		Select name=new Select(ele);
		name.selectByVisibleText("Name");
		
		//Click on Add To Cart for Sony experia
		driver.findElementByXPath("(//button[@class='button btn-cart'])[3]").click();
		
		//Change the quantity to 1000
		driver.findElementByXPath("//input[@class='input-text qty']").clear();
		driver.findElementByXPath("//input[@class='input-text qty']").sendKeys("1000");
		
		//Click on update
		driver.findElementByXPath("//button[@class='button btn-update']").click();
		
		//verify error message
		
		String err = driver.findElementByClassName("messages").getText();
		System.out.println(err);
		
		if(err.contains("products cannot be ordered"))
			System.out.println("The request quantity for sony expera not available");
		
		//Click on empty cart
		driver.findElementById("empty_cart_button").click();
		
		//Verify cart is empty
		String cartErr = driver.findElementByClassName("cart-empty").getText();
		if(cartErr.contains("no items"))
			System.out.println("Shopping cart is empty");
		driver.close();
}
}
