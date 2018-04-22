package week1day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowIrctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Launch URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Set<String> win = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(win);
		driver.switchTo().window(winList.get(1));
		driver.close();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByXPath("//div[@class='content-ele']/p[2]").getText());
		driver.switchTo().window(winList.get(0));
		driver.findElementById("usernameId").sendKeys("Vinothini");
		driver.close();
		
		
		
		
	}

}
