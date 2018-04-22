package week3;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class Selectable extends SeMethods{
@Test
	public void select()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "http://jqueryui.com/");
		click(locateElement("link text", "Selectable"));
		switchToFrame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		Actions builder=new Actions(driver);
		builder.clickAndHold(item1).release(item4).perform();
	}
}
