package guru99;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsLogin {
	@Test
	public void loginReport()
	{
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/result.html");
		report.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest test = extent.createTest("Login","Login to create account");
		test.pass("User id enterd successfully");
		test.pass("Password entered successfully");
		test.pass("Login Successfully");
		
		ExtentTest test2=extent.createTest("NewCustomer","New user registration");
		test2.pass("Welcom to GuruBank registration successfull");
		
		extent.flush();
		
	}
}
