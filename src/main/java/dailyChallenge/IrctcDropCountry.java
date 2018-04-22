package dailyChallenge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcDropCountry {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Launch URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");


		//Click on Sign up
		driver.findElementByLinkText("Sign up").click();

		//Enter the userID
		driver.findElementById("userRegistrationForm:userName").sendKeys("Vinothini");

		//Enter the Password 
		driver.findElementById("userRegistrationForm:password").sendKeys("Vinot1413");
		//confirm Password
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Vinot1413");
		
		//Select sequirty question
		WebElement seq = driver.findElementById("userRegistrationForm:securityQ");
		Select dri=new Select(seq);
		dri.selectByIndex(2);
		Thread.sleep(2000);
		
		//Answer for the sq ques
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Ajith");
		
		//Select the preferred language
		WebElement lan = driver.findElementById("userRegistrationForm:prelan");
		Select dri2=new Select(lan);
		dri2.selectByVisibleText("English");
		
		//Enter the first name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Vinothini");
		
		//Enter the Last name
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Vijaybabu");
		
		//Select the gender
		driver.findElementById("userRegistrationForm:gender:1").click();
		
		//Select the marital status
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		//Select the DOB
		WebElement day = driver.findElementById("userRegistrationForm:dobDay");
		Select drid=new Select(day);
		drid.selectByValue("14");
		WebElement mon = driver.findElementById("userRegistrationForm:dobMonth");
		Select drim=new Select(mon);
		drim.selectByValue("04");
		WebElement yr = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select driy=new Select(yr);
		driy.selectByValue("1992");
		
		//Select the Occupation of the user
		WebElement occ = driver.findElementById("userRegistrationForm:occupation");
		Select dri4=new Select(occ);
		dri4.selectByIndex(2);
		
		//Enter the Aadhaarcard no
		driver.findElementById("userRegistrationForm:uidno").sendKeys("3456");
		//Enter the Pan no
		driver.findElementById("userRegistrationForm:idno").sendKeys("allpvv");
		
		//Select the country 
		WebElement Con = driver.findElementById("userRegistrationForm:countries");
		Select dri5=new Select(Con);
		List<WebElement> options = dri5.getOptions();
		options.size();
		for(WebElement con:options)
		{
			System.out.println(con.getText());
		}
}
}
