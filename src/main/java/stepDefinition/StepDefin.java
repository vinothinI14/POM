package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefin {

	ChromeDriver driver;

	@Before
	public void beforeMethod(Scenario sc) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(sc.getName());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps/control/main");
	}

	@And("Enter the user name as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@And("Click the login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click crmsfa")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click Leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@And("Click Create Leads")
	public void clickCreateLeads() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the Company name as (.*)")
	public void enterCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}

	@And("Enter the First Name as (.*)")
	public void enterFirstName(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	}

	@And("Enter the Last Name as (.*)")
	public void enterLastName(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	}

	@When("Click on Create Button")
	public void clickCreateLead() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("New Lead created successfully")
	public void stepStatus() {
		System.out.println("Lead created successfully");

	}

		
	@After
	public void afterMethod(Scenario sc) {
		System.out.println(sc.getStatus());
		driver.close();
	}
}
