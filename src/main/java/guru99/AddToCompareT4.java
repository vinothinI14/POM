package guru99;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import wdMethods.ProjectMethods;

public class AddToCompareT4 extends ProjectMethods{
	
	@Test

	public void compare() throws InterruptedException
	{
				
		//Click on mobile
		driver.findElementByXPath("//a[text()='Mobile']").click();
		
		//Sort by name
		WebElement ele=driver.findElementByXPath("//label[text()='Sort By']/following::select");
		Select name=new Select(ele);
		name.selectByVisibleText("Name");
		
		//Click on Add To Compare
		driver.findElementByXPath("//ul[@class='add-to-links']/li[2]").click();
		
		//Click on compare
		driver.findElementByClassName("button");
		
		Thread.sleep(2000);
		//Move to new window
		Set<String> win = driver.getWindowHandles();
		List<String> winList=new ArrayList<>();
		winList.addAll(win);
		driver.switchTo().window(winList.get(1));
		
		driver.close();
	}
}
