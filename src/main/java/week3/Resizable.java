package week3;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class Resizable extends SeMethods{
	@Test
	public void reSize()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "http://jqueryui.com/");
		click(locateElement("link text", "Resizable"));
			
		switchToFrame(0);
		WebElement resize = driver.findElementById("resizable");
		/*int x=resize.getLocation().getX();
		System.out.println(x);
		int y=resize.getLocation().getY();
		System.out.println(x);*/
		Actions builder=new Actions(driver);
		builder.clickAndHold(resize).moveByOffset(50, 50).release().perform();
		
		
		
	}
}
