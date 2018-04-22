package dailyChallenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeastButOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dlist = driver.findElementByClassName("dropdown");
		Select dp=new Select(dlist);
		
		dp.selectByValue("3");
		
		WebElement dlist1 = driver.findElementById("dropdown1");
		Select dp1=new Select(dlist1);
		//dp1.selectByValue("3");
		List<WebElement> options = dp1.getOptions();
		System.out.println(options.size());
		dp1.selectByIndex(options.size()-1);
		
	}

}
