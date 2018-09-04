package collections;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Open the browser
		ChromeDriver driver = new ChromeDriver();		

		//Maximize the browser
		driver.manage().window().maximize();

		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Load the URL
		driver.get("https://www.redbus.in/search?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=22-Apr-2018&opId=0&busType=Any");
		
		// Find all the operators
		
		List<WebElement> opraters = driver.findElementsByClassName("service-name");
		Set<String> transportName = new TreeSet<String>();
		for (WebElement op : opraters) {
			transportName.add(op.getText());
			//System.out.println(op.getText());
		}
		System.out.println(transportName);
		
		
		
		
		
		
		
		
		
		
	}

}
