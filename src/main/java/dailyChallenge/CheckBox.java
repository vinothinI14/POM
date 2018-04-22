package dailyChallenge;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		System.out.println(driver.findElementByXPath("//label[@for='java']/following-sibling::input[1]").isSelected());
		driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]").click();
	}

}
