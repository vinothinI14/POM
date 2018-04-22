package week1day1;

import java.security.Signature;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.DBAddress;

public class IrctcLoginJava {

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
		dri5.selectByVisibleText("India");
		
		//Enter the Email id
		driver.findElementById("userRegistrationForm:email").sendKeys("vinothiniaut09@gmail.com");
		//Enter the ISD Mobile number
		driver.findElementById("userRegistrationForm:mobile").sendKeys("044-91402233");
		
		//Select the nationality 
		WebElement nal = driver.findElementById("userRegistrationForm:nationalityId");
		Select dri6=new Select(nal);
		dri6.selectByVisibleText("India");
		
		//Enter the Flat no
		driver.findElementById("userRegistrationForm:address").sendKeys("044");
		
		//Enter the Street name
		driver.findElementById("userRegistrationForm:street").sendKeys("Rathnam Nagar");
		
		//Enter the area/locality
		driver.findElementById("userRegistrationForm:area").sendKeys("Rathnam Nagar");
		
		//Enter the pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600001",Keys.TAB);
		
		//Enter the State
		
		//Select the city
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select dri7=new Select(city);
		dri7.selectByValue("-1");
		
		//Select the post office
		WebElement po = driver.findElementById("userRegistrationForm:postofficeName");
		Select dri8=new Select(po);
		dri7.selectByValue("-1");
		
		//Enter the phone number
		driver.findElementById("userRegistrationForm:landline").sendKeys("8122767497");
	}

}
