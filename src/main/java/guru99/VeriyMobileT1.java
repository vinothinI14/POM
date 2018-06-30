package guru99;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.utils.FileUtil;

import wdMethods.ProjectMethods;

public class VeriyMobileT1 extends ProjectMethods{

	@Test
	public void mobile() throws IOException, InterruptedException
	{
		login();		
		//Verify title
		String text = driver.findElementByXPath("//h2[contains(text(),'This is demo site for')]").getText();
		System.out.println(text);
		
		//Click mobile
		driver.findElementByXPath("//a[text()='Mobile']").click();
		
		//verify title
		String title = driver.getTitle();
		System.out.println(title);
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(WebElement allLink:link)
		{
			System.out.println(allLink.getText());
		}
		
		if(title=="Mobile")
		{
			System.out.println("The tile matched"+ title);
		}
		
		Thread.sleep(2000);
		//Select by name
		WebElement ele=driver.findElementByXPath("//label[text()='Sort By']/following::select");
		//WebElement ele = driver.findElement(By.cssSelector("select[title="\Sort By\"]"));
	/*	ele.getSize();*/
		Select name=new Select(ele);
		name.selectByVisibleText("Name");
			
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./GuruImage/img1.png");
		FileUtils.copyFile(src, des);
				
		driver.close();
		
	}
}
