package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Maximise the browser
		driver.manage().window().maximize();

		// Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// switch to frame
		driver.switchTo().frame("iframeResult");

		driver.findElementByXPath("//button[text()='Try it']").click();

		driver.switchTo().alert().sendKeys("Suvi");

		driver.switchTo().alert().accept();

		String temp = driver.findElementByXPath("//button[text()='Try it']/following::p").getText();
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		System.out.println(temp);

		if (temp.contains("Suvi"))
			System.out.println("True");

		else
			System.out.println("False");

	}

}
