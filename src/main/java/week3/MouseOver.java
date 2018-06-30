package week3;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;

public class MouseOver extends SeMethods {
@Test
	public void mouse()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome","https://www.flipkart.com/");
		click(locateElement("xpath", "//button[text()='✕']"));
		
		WebElement ele = locateElement("xpath", "//span[text()='Electronics']");
		WebElement charger = locateElement("xpath", "//span[text()='Chargers']");
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).click().perform();
		WebDriverWait wait=new WebDriverWait(driver, 10);   
		wait.until(ExpectedConditions.visibilityOf(charger));
		builder.click(charger).perform();

	}
}
