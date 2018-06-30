package collections;

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
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByClassName("LM6RPg").sendKeys("Bag",Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		List<WebElement> elements = wait.until(ExpectedConditions.numberOfElementsToBe(By.className("_1vC4OE"),40));
		
		ArrayList<Integer> price = new ArrayList<Integer>();
		
		
		for(WebElement e : elements) {
			
			int priceValue = Integer.parseInt(e.getText().replaceAll("[₹,]",""));
			price.add(priceValue);
			
		}

		//To sort
		
		Collections.sort(price);
		
		System.out.println(price);
		
		System.out.println("Lowest: "+price.get(0));
		
	//To find the largest before offer
		
		List<WebElement> element = wait.until(ExpectedConditions.numberOfElementsToBe(By.className("_3auQ3N"),40));
		ArrayList<Integer> offPrice=new ArrayList<>();
		for(WebElement e1:element)
		{
			int value = Integer.parseInt(e1.getText().replaceAll("[₹,]",""));
			offPrice.add(value);
		}
		
		Collections.sort(offPrice);
		System.out.println(offPrice);
		System.out.println("High Price :"+offPrice.get(40-1));

		
		driver.close();
}
	
}
