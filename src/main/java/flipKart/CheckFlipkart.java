package flipKart;

import org.junit.Test;

import wdMethods.ProjectMethods;

public class CheckFlipkart extends ProjectMethods{
	@Test
	public void flip()
	{
		startAppWithReturn("chrome", "https://www.flipkart.com/");
		click(locateElement("xpath", "//button[text()='✕']"));
		//click(locateElement("link text", "Login & Signup"));
		
		type(locateElement("class", "LM6RPg"),"Mac Laptops");
		click(locateElement("xpath	", "//button[@type='submit']"));
	}
}

