package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIrctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Maximise the browser
		driver.manage().window().maximize();
		
		// Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.irctc.co.in");
		
		/*WebElement frame = driver.findElementByXPath("//title[text()='SafeFrame Container']");
		driver.switchTo().frame(frame);*/
		driver.switchTo().frame(2);
		driver.findElementByXPath("//alt[@alt=\"Advertisement\"]").click();
	}

}
