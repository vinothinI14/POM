package flipKart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.es.E;

public class Flipkart {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByClassName("LM6RPg").sendKeys("Bag",Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		List<WebElement> elements = wait.until(ExpectedConditions.numberOfElementsToBe(By.className("_1vC4OE"),40));
		
		List<String> price = new ArrayList<String>();
		
		
		for(WebElement e : elements) {
			
			price.add(e.getText().replaceAll("[₹,]",""));
			
		}

		//To sort
		
		Collections.sort(price);
		
		System.out.print(price);
		System.out.print("Lowest: "+price.get(0));
		
		//To find the largest before offer
		
		List<WebElement> element = wait.until(ExpectedConditions.numberOfElementsToBe(By.className("_3auQ3N"),40));
		ArrayList<String> offPrice=new ArrayList<>();
		for(WebElement e1:element)
		{
			offPrice.add(e1.getText().replaceAll("[₹,]",""));
		}
		
		Collections.sort(offPrice);
		System.out.println(offPrice);
		System.out.println("High Price :"+offPrice.get(40-1));
		driver.close();
	}
	
}
