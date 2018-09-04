package Challenge;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("https://www.naukri.com/");

		// Way 1
		/*Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();*/	
		
		int y = driver.findElementByLinkText("Browse All Jobs").getLocation().getY();

		// Way 2
		((JavascriptExecutor) driver).executeScript("scroll(0,"+y+");");


	}
}
