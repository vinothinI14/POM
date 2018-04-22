package week3;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class Dragabble extends SeMethods{
	@Test
	public void drag()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "http://jqueryui.com/");
		click(locateElement("link text", "Draggable"));
		switchToFrame(0);
		WebElement drag = driver.findElementById("draggable");
		/*int x=drag.getLocation().getX();
		int y=drag.getLocation().getY();*/
		Actions builder=new Actions(driver);
		
		builder.clickAndHold(drag).perform();
		builder.contextClick(drag).perform();
		builder.doubleClick(drag).perform();
		
		
		
		
	}
}
