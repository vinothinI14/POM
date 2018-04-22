package week3;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import wdMethods.ProjectMethods;

public class CheckFlip extends ProjectMethods {
	@Test
	public void flip() throws InterruptedException
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "https://www.google.co.in");
		type(locateElement("id","lst-ib"),"flipkart");
		click(locateElement("xpath","//input[@value='Google Search']"));
		click(locateElement("xpath", "//h3[@class='r']/a"));
		click(locateElement("xpath", "//button[text()='✕']"));
		WebElement tvapp = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement cooler = driver.findElementByXPath("//span[text()='Air Coolers']");
				
		Actions builder= new Actions(driver);
		builder.moveToElement(tvapp).perform();
		Thread.sleep(2000);
		builder.click(cooler).perform();
		List<WebElement> images = driver.findElementsByTagName("img");
		System.out.println("The list od=f images presented in this page"+images.size());
		click(locateElement("xpath", "//div[@class='_3BTv9X']/following::a"));
		switchToWindow(1);
		
		
	}


		
	}


