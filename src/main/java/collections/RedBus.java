package collections;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElementById("src").sendKeys("Chennai",Keys.TAB);
		driver.findElementById("dest").sendKeys("Bangalore",Keys.TAB);
		
		driver.findElementById("onward_cal");
		WebElement tableList = driver.findElementByClassName("monthTitle");
		WebElement ele = tableList.findElement(By.xpath("//td[text()='22']"));
		ele.click();
				
		driver.findElementById("search_btn").click();		
		


		driver.close();


	}
}
