package dailyChallenge;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.ProjectMethods;

public class brokenLin extends ProjectMethods{
	@Test
	public void link()
	{
		RemoteWebDriver driver = startAppWithReturn("chrome", "https://www.google.co.in");
		List<WebElement> link = driver.findElementsByTagName("a");
		System.out.println("The total available link"+link.size());
		for(int i=0;i<link.size();i++)
		{
			WebElement elink = link.get(i);
			String url = elink.getAttribute("href");
			verifyLink(url);
		}

	}

	public void verifyLink(String urlLink)
	{
		
	}
}
