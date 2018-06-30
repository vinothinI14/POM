package week3;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class Droppable extends SeMethods {
	@Test
	public void drop()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "http://jqueryui.com/");
		click(locateElement("link text", "Droppable"));
		switchToFrame(0);
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		Actions builder=new Actions(driver);
				
		builder.dragAndDrop(drag, drop).perform();
		WebElement drag1 = driver.findElementById("draggable");
		int x =drag1.getLocation().getX();
		int y=drag1.getLocation().getY();

		builder.dragAndDropBy(drag, -x, -y).perform();
		
		
		
		
		
	}
}
