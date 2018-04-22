package week2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

public class MeargeLeads {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//Launch the URL
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("//input[@id='ComboBox_partyIdFrom']/following::img").click();;
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ComboBox_partyIdFrom']/following::img")));
		
		System.out.println(driver.getTitle());
		
		Set<String> newWin = driver.getWindowHandles();
		
		ArrayList<String> winList = new ArrayList<String>();
		
		winList.addAll(newWin);
		
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
					
		driver.findElementByXPath("//input[@name='id']").sendKeys("10");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		
		WebElement firstId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
		String Id = firstId.getText();
		System.out.println(Id);
		firstId.click();
		//System.out.println(driver.getTitle());
		driver.switchTo().window(winList.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//input[@id='ComboBox_partyIdTo']/following::img").click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ComboBox_partyIdTo']/following::img")));
		
		System.out.println(driver.getTitle());
		
		Set<String> newWin2 = driver.getWindowHandles();
		
		ArrayList<String> winList2 = new ArrayList<String>();
		
		winList2.addAll(newWin2);
		
		driver.switchTo().window(winList2.get(1));
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("11");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
	
		WebElement toFirstId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
		System.out.println(toFirstId.getText());
		toFirstId.click();
		driver.switchTo().window(winList.get(0));
		System.out.println(driver.getTitle());
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./snaps/beforemerge.png");
		FileUtils.copyFile(src, des);
		
		driver.findElementByLinkText("Merge").click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		driver.findElementByLinkText("Find Leads").click();
		

		driver.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys(Id);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		System.out.println(driver.findElementByClassName("x-paging-info").getText());
		
	}

}
