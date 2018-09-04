package collections;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

public class FlipKart {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Open the browser
		ChromeDriver driver = new ChromeDriver();		

		//Maximize the browser
		driver.manage().window().maximize();

		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Load the URL
		driver.get("https://www.flipkart.com");
		
		// close ✕
		driver.findElementByXPath("//button[text()='✕']").click();

		//Enter the search
		driver.findElementByName("q").sendKeys("Bags", Keys.ENTER);
				
		
		// Expectations to get 40 count
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.numberOfElementsToBe(By.className("_1vC4OE"), 40));

		// Get all Prices
		List<WebElement> pricesData = driver.findElementsByClassName("_1vC4OE");	
		List<Integer> prices = new ArrayList<>();
		for (WebElement price : pricesData) {
			System.out.println(price.getText().replaceAll("[₹,]", ""));
			prices.add(Integer.parseInt(price.getText().replaceAll("[₹,]", "")));
		}
		Collections.sort(prices);
		System.out.println(" The high price"+prices.get(prices.size()-1));

		
		
	}

}
