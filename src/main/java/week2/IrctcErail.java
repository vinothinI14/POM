package week2;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import wdMethods.SeMethods;

public class IrctcErail extends SeMethods {
	@Test
	public void erail()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		
		driver.findElementById("txtStationFrom").sendKeys("NDLS",Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		
		driver.findElementById("txtStationTo").sendKeys("BCT",Keys.TAB);
		WebElement checkbox = driver.findElementById("chkSelectDateOnly");
		if(checkbox.isSelected())
		{
			checkbox.click();
		}
		
		WebElement tableList = driver.findElementByXPath("//table[@class=\"DataTable TrainList\"]");
		List<WebElement> row = tableList.findElements(By.tagName("tr"));
		System.out.println(row.size());
		System.out.println("The list of available train in selected route");
		
		
		for(int i=0;i<row.size();i++)
		{
		List<WebElement> col = row.get(i).findElements(By.tagName("td"));
		
		System.out.print(col.get(1).getText()+"\t");
		
		System.out.print(col.get(3).getText()+"\t");
		System.out.println();
		
		}
		/*List<WebElement> col = tableList.findElements(By.tagName("td"));
		System.out.println(col.size());
		int count=col.size();
		for(int i=1;i<count;i++)
		{
			String name=row.get(i).getText();
			String name1=col.get(i).getText();
		//System.out.println(col.get(i+1).getText());
			System.out.println(name);
			System.out.println(name1);
		}*/
		/*WebElement frame = driver.findElementByXPath("//iframe[@title='3rd party ad content']");
		driver.switchTo().frame(frame);*/
		WebDriver frame = driver.switchTo().frame("google_ads_iframe_/1070960/Erail_HomePage_Dekstop_1_0");
		System.out.println("Moved Successfully");
		driver.findElementByXPath("//div[@id='google_ads_iframe_/1070960/Erail_HomePage_Dekstop_1_0__container__']/iframe").click();
		
}
}

