package flipKart;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class CheckFlipkart extends ProjectMethods{
	@Test
	public void flip()
	{
		startAppWithReturn("chrome", "https://www.flipkart.com/");
		click(locateElement("xpath", "//button[text()='✕']"));
		//click(locateElement("link text", "Login & Signup"));
		
		/*type(locateElement("class", "LM6RPg"),"Mac Laptops");
		click(locateElement("xpath", "//button[@type='submit']"));*/
		type(locateElement("class", "LM6RPg"),"bag");
		click(locateElement("class", "vh79eN"));
		ArrayList<WebElement> elements = locateElements("class", "_1uv9Cb");
		for(WebElement e : elements) {
			System.out.println(e.getText());
		}
		
		
	}
}

