package guru99;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateAccountT5 extends ProjectMethods{
	
	@Test(dataProvider="fetchData")
	public void create(String firstName,String lastName,String email_id,String password,String password1, String commonEmail) 
	{
	
		login();
		//Click on Account
		driver.findElementByXPath("//span[text()='Account']").click();
		
		//Click on register
	/*	WebElement ele = driver.findElementByClassName("links");
		Select list=new Select(ele);
		list.selectByVisibleText("Register");*/
		
		driver.findElementByXPath("//div[@class='links']/ul/li[5]").click();
		
		//Enter the firstname
		driver.findElementById("firstname").sendKeys(firstName);
		
		//Enter the lastname
		driver.findElementById("lastname").sendKeys(lastName);
		
		//Enter the Email address
		driver.findElementById("email_address").sendKeys(email_id);
		
		//Enter the password should be 6 char
		driver.findElementById("password").sendKeys(password);
		
		//Confirm the password
		driver.findElementById("confirmation").sendKeys(password1);
		
		//Click on Register
		driver.findElementByXPath("//button[@title='Register']").click();
		
		//Verify Registration complete
		String reg = driver.findElementByXPath("//li[@class='success-msg']").getText();
		
		if(reg.contains("Thank you for registering"))
			System.out.println("The Account registration is done");
		
		//Click on TV menu
		driver.findElementByLinkText("TV").click();
		
		//Click on wishlist
		driver.findElementByXPath("//ul[@class='add-to-links']/li").click();
		
		//Click on share wishlist
		driver.findElementByXPath("//button[@class='button btn-share']").click();
		
		//Enter the email and share commands
		driver.findElementById("email_address").sendKeys(commonEmail);
		
		//Click on share wish list
		driver.findElementByXPath("//span[text()='Share Wishlist']").click();
		
		//Verify wishlish shared
		String sharemsg = driver.findElementByClassName("success-msg").getText();
		
		if(sharemsg.contains("Your Wishlist has been shared."))
			System.out.println("Wish List shared successfully");
		
		driver.close();
		
	

}
}
