package week3;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class LearnSortable extends SeMethods{
@Test
	public void sort()
	{
	RemoteWebDriver driver = startAppWithReturn("chrome","http://jqueryui.com/sortable/");
	switchToFrame(0);
	WebElement ele1 = locateElement("xpath", "//li[text()='Item 1']");
	WebElement ele3 = locateElement("xpath", "//li[text()='Item 3']");
	WebElement ele4 = locateElement("xpath", "//li[text()='Item 4']");
	WebElement ele2 = locateElement("xpath", "//li[text()='Item 2']");
	Actions builder = new Actions(driver);
	int x = ele3.getLocation().getX();
	int y = ele3.getLocation().getY();
	builder.clickAndHold(ele1).moveByOffset(x, y).release().perform();
	int x1 = ele2.getLocation().getX();
	int y1 = ele2.getLocation().getY();
	builder.clickAndHold(ele4).moveByOffset(x1, y1).release().perform();
	}

}
