package week1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathGoogleLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://www.google.co.in");
		
		//Make search ur name in google search bar
		driver.findElementById("lst-ib").sendKeys("Vinovijay");
		
		//Click the google search button
		driver.findElementByXPath("//input[@type='submit']").click();
		
		//Count the number links available for ur search
		List<WebElement> list = driver.findElementsByPartialLinkText("Vino");
		System.out.println(list.size());
		list.get(5).click();
		System.out.println(driver.getCurrentUrl());
	}

}
