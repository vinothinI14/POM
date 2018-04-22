package collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

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
		driver.get("https://www.redbus.in/search?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=22-Apr-2018&opId=0&busType=Any");
		List<WebElement> operators = driver.findElementsByClassName("service-name");
		Set<String> tName= new TreeSet<String>();
		for(WebElement op:operators)
		{
			tName.add(op.getText());
		}
		System.out.println(tName);
		
		driver.close();


	}
}
